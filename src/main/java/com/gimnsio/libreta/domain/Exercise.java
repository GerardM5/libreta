package com.gimnsio.libreta.domain;

import com.gimnsio.libreta.persistence.entities.MuscleEntity;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Exercise {
    @NotNull
    private Long id;
    @NotNull
    private String name;
    private String image;
    private String gif;
    private String video;
    private String description;
    @NotNull
    private String type;
    @NotNull
    private Muscle principalMuscle;
    private Set<Muscle> secondaryMuscles;
}