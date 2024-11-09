package com.kgstrivers.parkingLot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkingLotApplication {

	public static void main(String[] args) {
		System.out.println("Hello, Parking Lot!");
		SpringApplication.run(ParkingLotApplication.class, args);
	}

}
