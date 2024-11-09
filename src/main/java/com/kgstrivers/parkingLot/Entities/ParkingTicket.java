package com.kgstrivers.parkingLot.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ParkingTicket {
    String ticketNumber;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    LocalDateTime entryTime;
    @Setter
    LocalDateTime exitTime;


    public double calculateFee() {
        // Implement fee calculation logic based on vehicle type and duration
        return 0.0;
    }
}
