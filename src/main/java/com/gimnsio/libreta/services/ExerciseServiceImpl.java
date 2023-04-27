package com.gimnsio.libreta.services;

import com.gimnsio.libreta.Mapper.ExerciseMapper;
import com.gimnsio.libreta.domain.Exercise;
import com.gimnsio.libreta.persistence.repositories.ExerciseRepository;
import org.springframework.stereotype.Service;


import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExerciseServiceImpl implements ExerciseService{

    ExerciseRepository exerciseRepository;

    ExerciseMapper exerciseMapper;

    @Override
    public List<Exercise> getAllExercises(Pageable pageable) {

        return this.exerciseRepository.findAll(pageable).stream().map(exerciseEntity -> {
            return exerciseMapper.mapExercise(exerciseEntity);
        }).collect(Collectors.toList());
    }

    @Override
    public Exercise getExerciseById(Long id) {
        return null;
    }

    @Override
    public List<Exercise> getExercisesByType(String type,Pageable pageable) {
        return this.exerciseRepository.findByType(type,pageable).stream().map(exerciseEntity -> {
            return exerciseMapper.mapExercise(exerciseEntity);
        }).collect(Collectors.toList());
    }

    @Override
    public List<Exercise> getExercisesByMuscle(Long muscleId, Pageable pageable) {
        return this.exerciseRepository.findByMuscle(muscleId,pageable).stream().map(exerciseEntity -> {
            return exerciseMapper.mapExercise(exerciseEntity);
        }).collect(Collectors.toList());
    }

    @Override
    public List<Exercise> getExercisesByMuscleAndType(Long muscleId, String type, Pageable pageable) {
        return this.exerciseRepository.findByMuscleAndType(muscleId,type,pageable).stream().map(exerciseEntity -> {
            return exerciseMapper.mapExercise(exerciseEntity);
        }).collect(Collectors.toList());
    }
}
