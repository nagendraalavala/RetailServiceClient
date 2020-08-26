package com.example.retailservice.Exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {
    @Bean
    public FeignErrorDecoder errorDecoder()
    {
        return new FeignErrorDecoder();
    }
}
