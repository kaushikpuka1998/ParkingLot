package com.kgstrivers.parkingLot.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class ParkingLot {
    String name;
    List<ParkingFloor> parkingSpotList;
    List<EntryGate> entryPointList;
    List<ExitGate> exitPointList;
    int maxCapacity;


    public void addFloor(ParkingFloor floor) {
        parkingSpotList.add(floor);
    }

    public void addEntryPoint(EntryGate entryPoint) {
        entryPointList.add(entryPoint);
    }

    public void addExitPoint(ExitGate exitPoint) {
        exitPointList.add(exitPoint);
    }

    public boolean isFull() {
        int occupiedSpots = parkingSpotList.stream()
                .mapToInt(ParkingFloor::getOccupiedSpots)
                .sum();
        return occupiedSpots >= maxCapacity;
    }
}
