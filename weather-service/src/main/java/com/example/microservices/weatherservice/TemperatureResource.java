package com.example.microservices.weatherservice;

import com.example.microservices.weatherservice.model.Temperature;
import com.example.microservices.weatherservice.model.TemperatureScale;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/temperature")
public class TemperatureResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Temperature> getAverageTemperature() {
        Temperature temperature = new Temperature();
        temperature.setTemperature(35D);
        temperature.setTemperatureScale(TemperatureScale.CELSIUS);

        return ResponseEntity.ok(temperature);
    }

}
