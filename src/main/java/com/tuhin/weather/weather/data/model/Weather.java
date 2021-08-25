package com.tuhin.weather.weather.data.model;

import lombok.Data;

@Data
public class Weather {
    Double temp;
    Double pressure;
    Double humidity;
    Double sea_level;
    Double grand_level;
    Double temp_max;
    Double temp_min;
    Double feels_like;
}
