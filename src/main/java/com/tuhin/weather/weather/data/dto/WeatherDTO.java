package com.tuhin.weather.weather.data.dto;

import com.tuhin.weather.weather.data.model.*;
import lombok.Data;

@Data
public class WeatherDTO {
    private Weather weather;
    private Sys sys;
}
