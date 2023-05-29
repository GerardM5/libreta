package com.gimnsio.libreta.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="muscles_exercises")
public class ExerciseMuscleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private ExerciseEntity exerciseId;
    @ManyToOne
    @JoinColumn(name = "muscle_id")
    private MuscleEntity muscleId;

}
