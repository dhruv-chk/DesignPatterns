package org.patterns.factory;

public class VehicleClient {
    private Vehicle vehicle;

    public VehicleClient(VehicleFactory factory) {
        this.vehicle = factory.createVehicle();
    }

    public Vehicle getVehicle(){
        return vehicle;
    }
}
