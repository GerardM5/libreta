package com.gimnsio.libreta.services;

import com.gimnsio.libreta.Mapper.ExerciseMapper;
import com.gimnsio.libreta.domain.Exercise;
import com.gimnsio.libreta.persistence.entities.ExerciseEntity;
import com.gimnsio.libreta.persistence.repositories.ExerciseRepository;
import org.springframework.stereotype.Service;


import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    ExerciseRepository exerciseRepository;

    ExerciseMapper exerciseMapper;

    public ExerciseServiceImpl(ExerciseRepository exerciseRepository, ExerciseMapper exerciseMapper) {
        this.exerciseRepository = exerciseRepository;
        this.exerciseMapper = exerciseMapper;
    }

    @Override
    public List<Exercise> getAllExercises(Pageable pageable) {

        return this.exerciseRepository.findAll(pageable).stream().map(exerciseEntity -> {
            return exerciseMapper.mapExercise(exerciseEntity);
        }).collect(Collectors.toList());
    }

    @Override
    public Exercise getExerciseById(Long id) {
        Optional<ExerciseEntity> exerciseEntityOptional = exerciseRepository.findById(id);

        if (exerciseEntityOptional.isPresent()) {
            ExerciseEntity exerciseEntity = exerciseEntityOptional.get();
            return exerciseMapper.mapExercise(exerciseEntity);
        } else {
            throw new NoSuchElementException("No se encontró el ejercicio con el ID: " + id);
        }
    }

    @Override
    public List<Exercise> getExercisesByType(String type, Pageable pageable) {
//        return this.exerciseRepository.findByType(type,pageable).stream().map(exerciseEntity -> {
//            return exerciseMapper.mapExercise(exerciseEntity);
//        }).collect(Collectors.toList());
        return null;
    }

    @Override
    public List<Exercise> getExercisesByMuscle(Long muscleId, Pageable pageable) {
//        return this.exerciseRepository.findByMuscle(muscleId,pageable).stream().map(exerciseEntity -> {
//            return exerciseMapper.mapExercise(exerciseEntity);
//        }).collect(Collectors.toList());
        return null;
    }

    @Override
    public List<Exercise> getExercisesByMuscleAndType(Long muscleId, String type, Pageable pageable) {
//        return this.exerciseRepository.findByMuscleAndType(muscleId,type,pageable).stream().map(exerciseEntity -> {
//            return exerciseMapper.mapExercise(exerciseEntity);
//        }).collect(Collectors.toList());
        return null;
    }
}
