package cz.tichy.service;

import cz.tichy.City;
import cz.tichy.connector.WeatherApiConnector;
import cz.tichy.dto.WeatherApiDto;
import cz.tichy.dto.WeatherDto;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    public WeatherDto getWeatherForCity(City cityEnum) {

        WeatherDto weatherDto = new WeatherDto();
        WeatherApiConnector connector = new WeatherApiConnector();
       WeatherApiDto weatherApiDto = connector.getWeatherForCity(cityEnum);

        return transfomrmDto(weatherApiDto);
    }

    public WeatherDto transfomrmDto(WeatherApiDto weatherApiDto){
        WeatherDto weatherDto = new WeatherDto();
        weatherDto.setLocation(weatherApiDto.getLocation().getName());
        weatherDto.setTimestamp(weatherApiDto.getLocation().getLocaltime()) ;
        weatherDto.setRelative_humidity(weatherApiDto.getCurrent().getHumidity());
        weatherDto.setTemp_celsius(weatherApiDto.getCurrent().getTemp_c());
        weatherDto.setWeather_description(weatherApiDto.getCurrent().getCondition().getText());
        weatherDto.setWind_speed_m_per_s(weatherApiDto.getCurrent().getWind_kph());
        weatherDto.setWind_direction(weatherApiDto.getCurrent().getWind_dir());

        return weatherDto;
    }
}
