package org.patterns.builder;

public class ComputerDirector {
    public void construct(Builder builder){
        builder.buildCPU();
        builder.buildRam();
        builder.buildStorage();
    }
}
