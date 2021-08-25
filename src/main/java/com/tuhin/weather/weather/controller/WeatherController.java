package com.tuhin.weather.weather.controller;

import com.tuhin.weather.weather.data.dto.WeatherDTO;
import com.tuhin.weather.weather.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/")
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping( "weather")
    public @ResponseBody Map<String, WeatherDTO>
    getWeather(@RequestParam String city) {
        return weatherService.getWeather(city);
    }

}
