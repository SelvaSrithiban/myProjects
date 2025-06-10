package com.projects.movieticketbooking.models;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Show extends BaseModel{
    private LocalDateTime time;
    private Movie movie;
    private Screen screen;
}
