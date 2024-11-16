package com.wiseman;


public class Alien {

   private Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }


    public Alien(
            Computer computer
    ) {
        this.computer = computer;
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
