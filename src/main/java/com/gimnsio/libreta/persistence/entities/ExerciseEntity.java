package com.gimnsio.libreta.persistence.entities;

import com.gimnsio.libreta.domain.Muscle;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;


@NoArgsConstructor
@Entity(name="exercises")
@Data
public class ExerciseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String image;
    private String video;
    private String description;
    @ManyToMany
    @JoinTable(
            name = "muscles_exercises",
            joinColumns = @JoinColumn(name = "exercise_id"),
            inverseJoinColumns = @JoinColumn(name = "muscle_id")
    )
    private Set<MuscleEntity> muscles;
}