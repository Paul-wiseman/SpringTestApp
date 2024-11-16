package com.wiseman;

public class Desktop implements Computer {
    private int ram;

    public Desktop(){
        System.out.println("Creating new Laptop ----.");
    }


    @Override
    public void startCpu() {
        System.out.println("Desktop Cpu is running.....");
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public int ram() {
        return ram;
    }

    @Override
    public void compile() {
        System.out.println("Compiling your code in a desktop computer");
    }
}
