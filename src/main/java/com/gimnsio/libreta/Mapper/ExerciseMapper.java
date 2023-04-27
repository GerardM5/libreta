package com.gimnsio.libreta.Mapper;

import com.gimnsio.libreta.domain.Exercise;
import com.gimnsio.libreta.persistence.entities.ExerciseEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExerciseMapper {

    public Exercise mapExercise(ExerciseEntity exerciseEntity);

    public ExerciseEntity mapExerciseEntity(Exercise exercise);

}
