package com.gimnsio.libreta.domain;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Routine {
    @Id
    private Long id;
    private String name;
    private List<Exercise> exercises;
    private User creator;

}
