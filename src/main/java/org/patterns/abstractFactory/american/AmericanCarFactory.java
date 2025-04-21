package org.patterns.abstractFactory.american;

import org.patterns.abstractFactory.interfaces.Car;
import org.patterns.abstractFactory.interfaces.CarFactory;
import org.patterns.abstractFactory.interfaces.CarSpecification;
import org.patterns.abstractFactory.cars.Sedan;

public class AmericanCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createSpecification() {
        return new AmericanCarSpec();
    }
}
