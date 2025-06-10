package com.projects.movieticketbooking.models;

import java.time.LocalDateTime;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id
    private int id;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
