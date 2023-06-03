package com.gimnsio.libreta.services;

import com.gimnsio.libreta.domain.Exercise;

import com.gimnsio.libreta.domain.Muscle;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface ExerciseService {

    public List<Exercise> getAllExercises(Pageable pageable);


    public Exercise getExerciseById(Long id);

    public Exercise updateExercise(Long exerciseId, Exercise updatedExercise);

    public Exercise createExercise(Exercise exercise);

    public void deleteExercise(Long id);

    public List<Exercise> getExercisesByMuscle(Long muscle_id);
}
