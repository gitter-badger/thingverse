package com.thingverse.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

@SpringBootApplication
@PropertySource(value = {"classpath:application-test.properties"})
public class SampleLoggingApp {

    private static Logger LOGGER = LoggerFactory.getLogger(SampleLoggingApp.class);

    public static void main(String[] args) {
        SpringApplication.run(SampleLoggingApp.class, args);
    }

    @Bean
    public ConversionService conversionService() {
        return new DefaultConversionService();
    }
}
