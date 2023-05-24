package com.gimnsio.libreta.Mapper;

import com.gimnsio.libreta.domain.Routine;
import com.gimnsio.libreta.persistence.entities.RoutineEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoutineMapper {

    public Routine mapRoutine(RoutineEntity routineEntity);

    public RoutineEntity mapRoutineEntity(Routine routine);
}
