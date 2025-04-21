package org.patterns.abstractFactory.european;

import org.patterns.abstractFactory.interfaces.CarSpecification;

public class EuropeanCarSpec implements CarSpecification {
    @Override
    public void display() {
        System.out.println("Europe Car Specification: Fuel efficiency and emissions compliant with EU standards.");
    }
}
