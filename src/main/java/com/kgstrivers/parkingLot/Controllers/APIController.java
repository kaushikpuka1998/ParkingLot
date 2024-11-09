package com.kgstrivers.parkingLot.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Parking Lot!";
    }
}
