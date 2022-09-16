package com.microservices.sample.limitsservice.controller;

import com.microservices.sample.limitsservice.config.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private LimitsConfiguration limits;

    @GetMapping("/limits")
    public LimitsConfiguration returnLimits(){
        return new LimitsConfiguration(limits.getMaximum(), limits.getMinimum(), limits.getMsg());
    }
}
