package com.wiseman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // initializing spring context using Xml configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien alien =  context.getBean(Alien.class);
        alien.getComputer().startCpu();
        alien.getComputer().compile();

        System.out.println(alien.getAge() + " with computer " + alien.getComputer().ram());

    }
}
