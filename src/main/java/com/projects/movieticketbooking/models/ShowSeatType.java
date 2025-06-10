package com.projects.movieticketbooking.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeatType extends BaseModel{
    private Show show;
    private String type;
    private int price;
}
