package com.tuhin.weather.weather.client;

import com.tuhin.weather.weather.data.dto.OpenWeatherDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "ACC-SERVICE-OPEN-WEATHER", url = "https://api.openweathermap.org/data/2.5/")
public interface OpenWeatherClient  {

    @RequestMapping(method = RequestMethod.GET, value = "weather")
    OpenWeatherDTO getOpenWeather(@RequestParam(value = "q") String division, @RequestParam(value = "appid") String appId);

}
