package com.gimnsio.libreta.Mapper;

import com.gimnsio.libreta.domain.Muscle;
import com.gimnsio.libreta.persistence.entities.MuscleEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MuscleMapper {

    public Muscle mapMuscle(MuscleEntity muscleEntity);

    public MuscleEntity mapMuscleEntity(Muscle muscle);
}
