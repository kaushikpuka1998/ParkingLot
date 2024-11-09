package com.kgstrivers.parkingLot.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Payment {
    PaymentType paymentType;
    double amount;

    public boolean processPayment() {
        // Implement payment processing logic
        return true;
    }
}
