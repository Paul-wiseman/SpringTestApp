package com.wiseman;


import org.springframework.beans.factory.annotation.Autowired;

public class Alien {

    @Autowired
   private Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }


    public Alien() {
        System.out.println("Creating Alien specie ----.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public void code() {
        System.out.println("coding.....");
    }
}
