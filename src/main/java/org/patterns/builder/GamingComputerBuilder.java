package org.patterns.builder;

public class GamingComputerBuilder implements Builder{

    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCpu("Gaming CPU");
    }

    @Override
    public void buildRam() {
        computer.setRam("16GB DDR5");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("1TB SSD");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
