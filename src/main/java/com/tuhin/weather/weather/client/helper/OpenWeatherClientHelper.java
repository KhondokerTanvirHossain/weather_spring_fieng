package com.tuhin.weather.weather.client.helper;

import com.tuhin.weather.weather.client.OpenWeatherClient;
import com.tuhin.weather.weather.constant.AppId;
import com.tuhin.weather.weather.data.dto.OpenWeatherDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OpenWeatherClientHelper {

    private final OpenWeatherClient openWeatherClient;

    public OpenWeatherDTO getOpenWeather(String division) {
        return openWeatherClient.getOpenWeather(division, AppId.AppId.getValue());
    }
}
