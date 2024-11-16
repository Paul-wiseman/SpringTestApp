package com.wiseman;

public class Laptop implements Computer {
    private int ram = 5;

    public Laptop() {
        System.out.println("Creating new Laptop ----.");
    }

    public int setRam(int ram) {
        return this.ram = ram;
    }

    @Override
    public void startCpu() {
        System.out.println("Laptop Cpu is running.....");
    }

    @Override
    public void compile() {
        System.out.println("Compiling your code inside a laptop .....");
    }

    @Override
    public int ram() {
        return ram;
    }
}
