package com.projects.movieticketbooking.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Region extends BaseModel{
    private String name;
    private List<Theatre> theatres;

}
