package com.microservices.sample.limitsservice.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ConfigurationProperties("limits-service")
public class LimitsConfiguration {
    private int maximum;
    private int minimum;
    private String msg;
}
