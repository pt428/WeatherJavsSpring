package cz.tichy.dto;

public class WeatherDto {
    private String location;
    private String timestamp;
    private double temp_celsius;
private int relative_humidity;
private double wind_speed_m_per_s;
private  String wind_direction;
private  String wind_description;
private String weather_description;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }

    public String getWind_description() {
        return wind_description;
    }

    public void setWind_description(String wind_description) {
        this.wind_description = wind_description;
    }


    public String getWeather_description() {
        return weather_description;
    }

    public void setWeather_description(String weather_description) {
        this.weather_description = weather_description;
    }

    public int getRelative_humidity() {
        return relative_humidity;
    }

    public void setRelative_humidity(int relative_humidity) {
        this.relative_humidity = relative_humidity;
    }

    public double getTemp_celsius() {
        return temp_celsius;
    }

    public void setTemp_celsius(double temp_celsius) {
        this.temp_celsius = temp_celsius;
    }

    public double getWind_speed_m_per_s() {
        return wind_speed_m_per_s;
    }

    public void setWind_speed_m_per_s(double wind_speed_m_per_s) {
        this.wind_speed_m_per_s = wind_speed_m_per_s;
    }
}
