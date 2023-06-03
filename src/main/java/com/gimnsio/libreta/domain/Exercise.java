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
    private Long id;
    private String name;
    private String image;
    private String video;
    private String description;
    private Set<Muscle> muscles;
}
