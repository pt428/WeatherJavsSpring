package cz.tichy.controller;

import cz.tichy.City;
import cz.tichy.connector.WeatherApiConnector;
import cz.tichy.dto.WeatherDto;
import cz.tichy.service.WeatherService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class WeatherController {
    private WeatherService weatherService;

    public WeatherController() {
        weatherService = new WeatherService();
    }


@CrossOrigin
    @RequestMapping({"/weather", "/weather/"})
    public Collection<WeatherDto> getWheather() {
        List<WeatherDto> weatherDtos = new ArrayList<>();

        for (City city: City.values()){
            WeatherDto weatherDto = weatherService.getWeatherForCity(city);
            weatherDtos.add(weatherDto);
        }
        return weatherDtos;
    }
@CrossOrigin
    @RequestMapping("/weather/{city}")
    public WeatherDto getWeatherForCity(@PathVariable("city") String city) {
        City cityEnum = City.valueOf(city.toUpperCase());
        WeatherService weatherService = new WeatherService();

        return weatherService.getWeatherForCity(cityEnum);
    }


}
