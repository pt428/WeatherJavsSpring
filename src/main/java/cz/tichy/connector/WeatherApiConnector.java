package cz.tichy.connector;

import cz.tichy.City;
import cz.tichy.dto.WeatherApiDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public class WeatherApiConnector {
    //https://api.weatherapi.com/v1/current.json?key=3c010fdd7e644e66af772452242905 &q=London&aqi=no
    private static String baseURL = "https://api.weatherapi.com/";
    private static String urlParams = "v1/current.json?key=";
    private static String APIKey = "3c010fdd7e644e66af772452242905";
    private static String url = baseURL + urlParams + APIKey + "&q=";

    public WeatherApiDto getWeatherForCity(City city) {
        RestTemplate template = new RestTemplate();
        URI uri = null;
        try {
            uri = new URI(url + city.toString());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        ResponseEntity<WeatherApiDto> response = template.getForEntity(uri, WeatherApiDto.class);
        return response.getBody();
    }
}
