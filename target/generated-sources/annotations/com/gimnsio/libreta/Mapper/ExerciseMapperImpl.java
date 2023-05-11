package com.gimnsio.libreta.Mapper;

import com.gimnsio.libreta.domain.Exercise;
import com.gimnsio.libreta.persistence.entities.ExerciseEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-02T18:41:32+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class ExerciseMapperImpl implements ExerciseMapper {

    @Override
    public Exercise mapExercise(ExerciseEntity exerciseEntity) {
        if ( exerciseEntity == null ) {
            return null;
        }

        Exercise exercise = new Exercise();

        exercise.setId( exerciseEntity.getId() );
        exercise.setName( exerciseEntity.getName() );
        exercise.setImage( exerciseEntity.getImage() );
        exercise.setGif( exerciseEntity.getGif() );
        exercise.setVideo( exerciseEntity.getVideo() );
        exercise.setDescription( exerciseEntity.getDescription() );
        exercise.setType( exerciseEntity.getType() );
        exercise.setPrincipalMuscle( exerciseEntity.getPrincipalMuscle() );

        return exercise;
    }

    @Override
    public ExerciseEntity mapExerciseEntity(Exercise exercise) {
        if ( exercise == null ) {
            return null;
        }

        ExerciseEntity exerciseEntity = new ExerciseEntity();

        exerciseEntity.setId( exercise.getId() );
        exerciseEntity.setName( exercise.getName() );
        exerciseEntity.setImage( exercise.getImage() );
        exerciseEntity.setGif( exercise.getGif() );
        exerciseEntity.setVideo( exercise.getVideo() );
        exerciseEntity.setDescription( exercise.getDescription() );
        exerciseEntity.setType( exercise.getType() );
        exerciseEntity.setPrincipalMuscle( exercise.getPrincipalMuscle() );

        return exerciseEntity;
    }
}
