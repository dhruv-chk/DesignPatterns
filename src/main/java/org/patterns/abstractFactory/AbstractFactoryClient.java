package org.patterns.abstractFactory;

import org.patterns.abstractFactory.american.AmericanCarFactory;
import org.patterns.abstractFactory.european.EuropeanCarFactory;
import org.patterns.abstractFactory.interfaces.Car;
import org.patterns.abstractFactory.interfaces.CarFactory;
import org.patterns.abstractFactory.interfaces.CarSpecification;

public class AbstractFactoryClient {
    public static void execute(){
        // Abstract Factory Design Pattern
        CarFactory americanFactory = new AmericanCarFactory();
        Car americanCar = americanFactory.createCar();
        CarSpecification americanSpec = americanFactory.createSpecification();

        americanCar.assemble();
        americanSpec.display();

        // Creating cars for Europe
        CarFactory europeanFactory = new EuropeanCarFactory();
        Car europeanCar = europeanFactory.createCar();
        CarSpecification europeanSpec = europeanFactory.createSpecification();

        europeanCar.assemble();
        europeanSpec.display();
    }
}
