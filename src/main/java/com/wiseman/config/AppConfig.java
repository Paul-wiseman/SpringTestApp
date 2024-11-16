package com.wiseman.config;

import com.wiseman.Alien;
import com.wiseman.Computer;
import com.wiseman.Desktop;
import com.wiseman.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Desktop desktop (){
        return new Desktop();
    }

    @Bean(name = "arkadian")
    public Alien alien(){
        return new Alien();
    }

    @Bean
    public Computer computer(){
        return new Laptop();
    }
}
