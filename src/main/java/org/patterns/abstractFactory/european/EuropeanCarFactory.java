package org.patterns.abstractFactory.european;

import org.patterns.abstractFactory.interfaces.Car;
import org.patterns.abstractFactory.interfaces.CarFactory;
import org.patterns.abstractFactory.interfaces.CarSpecification;
import org.patterns.abstractFactory.cars.Suv;

public class EuropeanCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Suv();
    }

    @Override
    public CarSpecification createSpecification() {
        return new EuropeanCarSpec();
    }
}
