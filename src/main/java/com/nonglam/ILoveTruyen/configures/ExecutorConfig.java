package com.nonglam.ILoveTruyen.configures;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class ExecutorConfig {
    @Bean
    public ExecutorService taskExecutor(){
        return Executors.newSingleThreadExecutor();
    }
}
