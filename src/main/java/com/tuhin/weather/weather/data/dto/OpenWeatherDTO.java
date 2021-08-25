package com.tuhin.weather.weather.data.dto;

import com.tuhin.weather.weather.data.model.Sys;
import com.tuhin.weather.weather.data.model.Weather;
import lombok.Data;

@Data
public class OpenWeatherDTO {
    Weather main;
    Sys sys;
}
