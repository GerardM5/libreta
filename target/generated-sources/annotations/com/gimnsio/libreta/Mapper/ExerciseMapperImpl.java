package com.gimnsio.libreta.Mapper;

import com.gimnsio.libreta.domain.Exercise;
import com.gimnsio.libreta.domain.Muscle;
import com.gimnsio.libreta.persistence.entities.ExerciseEntity;
import com.gimnsio.libreta.persistence.entities.MuscleEntity;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-11T20:51:36+0200",
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
        exercise.setPrincipalMuscle( muscleEntityToMuscle( exerciseEntity.getPrincipalMuscle() ) );
        exercise.setSecondaryMuscles( muscleEntitySetToMuscleSet( exerciseEntity.getSecondaryMuscles() ) );

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
        exerciseEntity.setPrincipalMuscle( muscleToMuscleEntity( exercise.getPrincipalMuscle() ) );
        exerciseEntity.setSecondaryMuscles( muscleSetToMuscleEntitySet( exercise.getSecondaryMuscles() ) );

        return exerciseEntity;
    }

    protected Muscle muscleEntityToMuscle(MuscleEntity muscleEntity) {
        if ( muscleEntity == null ) {
            return null;
        }

        Muscle muscle = new Muscle();

        muscle.setId( muscleEntity.getId() );
        muscle.setName( muscleEntity.getName() );
        muscle.setImage( muscleEntity.getImage() );
        muscle.setMuscleGroup( muscleEntity.getMuscleGroup() );

        return muscle;
    }

    protected Set<Muscle> muscleEntitySetToMuscleSet(Set<MuscleEntity> set) {
        if ( set == null ) {
            return null;
        }

        Set<Muscle> set1 = new LinkedHashSet<Muscle>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( MuscleEntity muscleEntity : set ) {
            set1.add( muscleEntityToMuscle( muscleEntity ) );
        }

        return set1;
    }

    protected MuscleEntity muscleToMuscleEntity(Muscle muscle) {
        if ( muscle == null ) {
            return null;
        }

        MuscleEntity muscleEntity = new MuscleEntity();

        muscleEntity.setId( muscle.getId() );
        muscleEntity.setName( muscle.getName() );
        muscleEntity.setImage( muscle.getImage() );
        muscleEntity.setMuscleGroup( muscle.getMuscleGroup() );

        return muscleEntity;
    }

    protected Set<MuscleEntity> muscleSetToMuscleEntitySet(Set<Muscle> set) {
        if ( set == null ) {
            return null;
        }

        Set<MuscleEntity> set1 = new LinkedHashSet<MuscleEntity>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Muscle muscle : set ) {
            set1.add( muscleToMuscleEntity( muscle ) );
        }

        return set1;
    }
}
