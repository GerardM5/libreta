package com.gimnsio.libreta.persistence.entities;

import com.gimnsio.libreta.domain.Exercise;
import com.gimnsio.libreta.domain.Routine;
import jakarta.persistence.*;

@Entity(name = "routine_exercise")
public class RoutineExerciseEntity {
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "routine_id")
    private RoutineEntity routine;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private ExerciseEntity exercise;

}