package com.kgstrivers.parkingLot.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Data
@AllArgsConstructor
public class DisplayBoard {
    private Map<ParkingSpotType, Integer> availableSpots = new HashMap<>();

    public void update(List<ParkingSpot> spots) {
        for (ParkingSpotType type : ParkingSpotType.values()) {
            int count = (int) spots.stream()
                    .filter(spot -> spot.parkingSpotType == type && spot.isAvailable)
                    .count();
            availableSpots.put(type, count);
        }
    }

    public void show() {
        // Display the available spots on the board
    }

    // Other methods to manage the display board
}
