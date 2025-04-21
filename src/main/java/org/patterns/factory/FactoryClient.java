package org.patterns.factory;

import org.patterns.factory.fourWheeler.FourWheelerFactory;
import org.patterns.factory.twoWheeler.TwoWheelerFactory;

public class FactoryClient {

    public static void execute() {
        // Factory Design Pattern
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        VehicleClient twoClient = new VehicleClient(twoWheelerFactory);
        Vehicle twoWheeler = twoClient.getVehicle();
        twoWheeler.printVehicle();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        VehicleClient fourClient = new VehicleClient(fourWheelerFactory);
        Vehicle fourWheeler = fourClient.getVehicle();
        fourWheeler.printVehicle();
    }
}
