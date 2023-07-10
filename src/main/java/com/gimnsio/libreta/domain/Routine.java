package com.gimnsio.libreta.domain;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Routine {
    @Id
    private Long id;
    private String name;
    private Set<Exercise> exercises;

    private UserE creator;

}
