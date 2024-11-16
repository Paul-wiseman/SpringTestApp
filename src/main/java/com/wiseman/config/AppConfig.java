package com.wiseman.config;

import com.wiseman.Alien;
import com.wiseman.Computer;
import com.wiseman.Desktop;
import com.wiseman.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope(value = "prototype")
    public Alien alien(
            @Qualifier("desktop") Computer computer
    ) {
        return new Alien(computer);
    }

    @Bean
    @Scope(value = "prototype")
    public Computer laptop() {
        return new Laptop();
    }

    @Bean
    @Scope(value = "prototype")
    public Computer desktop() {
        return new Desktop();
    }



}
