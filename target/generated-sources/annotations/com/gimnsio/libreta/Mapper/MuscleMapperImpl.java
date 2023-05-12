package com.gimnsio.libreta.Mapper;

import com.gimnsio.libreta.domain.Muscle;
import com.gimnsio.libreta.persistence.entities.MuscleEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-11T20:32:32+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class MuscleMapperImpl implements MuscleMapper {

    @Override
    public Muscle mapMuscle(MuscleEntity muscleEntity) {
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

    @Override
    public MuscleEntity mapMuscleEntity(Muscle muscle) {
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
}
