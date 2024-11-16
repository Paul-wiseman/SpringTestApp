package com.wiseman;

import com.wiseman.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // initializing spring context using Xml configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien alien = context.getBean(Alien.class);
        alien.getComputer().startCpu();
        alien.getComputer().compile();

        System.out.println(alien.getAge() + " with computer " + alien.getComputer().ram());

    }
}
