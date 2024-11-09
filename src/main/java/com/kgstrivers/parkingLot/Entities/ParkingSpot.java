package com.kgstrivers.parkingLot.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ParkingSpot {
    String id;
    Boolean isAvailable;
    ParkingSpotType parkingSpotType;
    Vehicle vehicle;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isAvailable = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isAvailable = true;
    }
}
