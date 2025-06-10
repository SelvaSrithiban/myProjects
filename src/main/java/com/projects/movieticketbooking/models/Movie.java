package com.projects.movieticketbooking.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie extends BaseModel{
    private String title;
    private int duration;
    private List<String> cast;
    private int releaseYear;
    private List<Language> languages;
}
