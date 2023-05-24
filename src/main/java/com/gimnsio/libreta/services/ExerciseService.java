package com.gimnsio.libreta.services;

import com.gimnsio.libreta.domain.Exercise;

import org.springframework.data.domain.Pageable;
import java.util.List;

public interface ExerciseService {

    public List<Exercise> getAllExercises(Pageable pageable);


    public Exercise getExerciseById(Long id);

    public Exercise updateExercise(Long exerciseId, Exercise updatedExercise);

    public List<Exercise> getExercisesByType(String type, Pageable pageable);

    public List<Exercise> getExercisesByMuscle(Long muscle_id, Pageable pageable);

    public List<Exercise> getExercisesByMuscleAndType(Long muscleId, String type, Pageable pageable);
}
