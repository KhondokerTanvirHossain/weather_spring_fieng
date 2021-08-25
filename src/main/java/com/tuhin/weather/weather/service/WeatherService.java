package com.tuhin.weather.weather.service;

import com.tuhin.weather.weather.client.helper.OpenWeatherClientHelper;
import com.tuhin.weather.weather.data.dto.OpenWeatherDTO;
import com.tuhin.weather.weather.data.dto.WeatherDTO;
import com.tuhin.weather.weather.data.model.Weather;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final OpenWeatherClientHelper openWeatherClientHelper;


    public Map<String, WeatherDTO> getWeather(String city) {
        Map<String, WeatherDTO> map = new HashMap<>();
        OpenWeatherDTO openWeatherDTO = getOpenWeather(city);
        WeatherDTO weatherDTO = new WeatherDTO();
        weatherDTO.setWeather(openWeatherDTO.getMain());
        weatherDTO.setSys(openWeatherDTO.getSys());
        map.put(city, weatherDTO);
        return map;
    }

    private OpenWeatherDTO getOpenWeather(String division) {
        return openWeatherClientHelper.getOpenWeather(division);
    }
}
