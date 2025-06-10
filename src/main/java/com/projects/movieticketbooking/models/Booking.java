package com.projects.movieticketbooking.models;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{
    private String bookingId;
    private int amount;
    private User user;
    private List<Seat> seat;
    private List<Payment> payment;
    private BookingStatus status;

}
