package com.projects.movieticketbooking.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat extends BaseModel{
    private String name;
    private int rowVal;
    private int colVal;
    private SeatType seatType;

}
