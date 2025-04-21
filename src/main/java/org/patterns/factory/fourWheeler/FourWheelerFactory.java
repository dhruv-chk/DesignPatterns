package org.patterns.factory.fourWheeler;

import org.patterns.factory.Vehicle;
import org.patterns.factory.VehicleFactory;

public class FourWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
