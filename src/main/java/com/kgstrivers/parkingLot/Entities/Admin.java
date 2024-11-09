package com.kgstrivers.parkingLot.Entities;

public class Admin {
    private String name;

    public Admin(String name) {
        this.name = name;
    }

    public void addFloor(ParkingLot parkingLot, ParkingFloor floor) {
        parkingLot.addFloor(floor);
    }

    public void addSpot(ParkingFloor floor, ParkingSpot spot) {
        floor.addSpot(spot);
    }

    // Other methods to manage the parking lot
}
