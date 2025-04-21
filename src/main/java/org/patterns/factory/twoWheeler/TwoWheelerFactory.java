package org.patterns.factory.twoWheeler;

import org.patterns.factory.Vehicle;
import org.patterns.factory.VehicleFactory;

public class TwoWheelerFactory  implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
