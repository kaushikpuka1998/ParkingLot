package com.kgstrivers.parkingLot.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ParkingFloor {
    String name;
    List<ParkingSpot> spots;
    DisplayBoard displayBoard;


    public void addSpot(ParkingSpot spot) {
        spots.add(spot);
    }

    public int getOccupiedSpots() {
        return (int) spots.stream().filter(spot -> !spot.isAvailable()).count();
    }

    public void updateDisplayBoard() {
        displayBoard.update(spots);
    }


}
