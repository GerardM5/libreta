package com.gimnsio.libreta.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name="muscles_exercises")
public class ExerciseMuscleEntity {
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private ExerciseEntity exerciseId;
    @ManyToOne
    @JoinColumn(name = "muscle_id")
    private MuscleEntity muscleId;

}
