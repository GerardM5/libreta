package com.gimnsio.libreta.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="muscles")
public class MuscleEntity {
    @NotNull
    @Id
    private Long id;
    private String name;
    private String image;
    private String muscleGroup;
}
