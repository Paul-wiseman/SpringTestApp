package com.wiseman.config;

import com.wiseman.Alien;
import com.wiseman.Computer;
import com.wiseman.Desktop;
import com.wiseman.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "martianManhunter")
    @Scope(value = "prototype")
    public Alien alien() {
        return new Alien();
    }

    @Bean
    @Scope(value = "prototype")
    public Computer computer() {
        return new Laptop();
    }
}
