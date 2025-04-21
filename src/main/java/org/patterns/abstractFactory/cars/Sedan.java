package org.patterns.abstractFactory.cars;

import org.patterns.abstractFactory.interfaces.Car;

public class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Sedan car.");
    }
}
