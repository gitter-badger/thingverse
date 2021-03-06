package com.thingverse.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

@SpringBootApplication
/**
 * Use -Dspring.profiles.active=test to set the profile. The env specific config files will be parsed automatically.
 */
//@PropertySource(value = {"classpath:application.yml", "classpath:${THINGVERSE_ENV}-application.yml"}, ignoreResourceNotFound = true)
public class ThingverseAPIApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(ThingverseAPIApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ThingverseAPIApplication.class, args);
    }

    @Bean
    public ConversionService conversionService() {
        return new DefaultConversionService();
    }
}
