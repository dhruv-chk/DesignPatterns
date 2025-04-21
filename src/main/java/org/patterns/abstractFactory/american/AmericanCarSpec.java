package org.patterns.abstractFactory.american;

import org.patterns.abstractFactory.interfaces.CarSpecification;

public class AmericanCarSpec implements CarSpecification {
    @Override
    public void display() {
        System.out.println("America Car Specification: Safety features compliant with local regulations.");
    }
}
