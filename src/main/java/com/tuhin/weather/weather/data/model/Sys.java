package com.tuhin.weather.weather.data.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Sys {
    private String country;
    private BigDecimal sunrise;
    private BigDecimal sunset;
}
