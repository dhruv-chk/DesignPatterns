package org.patterns.abstractFactory.cars;

import org.patterns.abstractFactory.interfaces.Car;

public class Suv implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling SUV car.");
    }
}
