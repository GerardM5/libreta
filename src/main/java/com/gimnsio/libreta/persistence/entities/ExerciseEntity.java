package com.gimnsio.libreta.persistence.entities;

import com.gimnsio.libreta.domain.Muscle;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="exercise")
public class ExerciseEntity {
    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
    private List<Muscle> secondaryMuscles;
}