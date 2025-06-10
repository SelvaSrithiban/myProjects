package com.projects.movieticketbooking.models;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment extends BaseModel{
    private int amount;
    private String referenceNumber;
    private LocalDateTime timeOfPayment;
    private List<PaymentMode> mode;
    private PaymentStatus status;
    private PaymentGateway gateway;
}
