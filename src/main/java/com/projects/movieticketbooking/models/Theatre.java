package com.projects.movieticketbooking.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Theatre extends BaseModel{
    private String name;
    private String address;
    private Region region;
    private List<Screen> screens;

}
