package com.gimnsio.libreta.services;

import com.gimnsio.libreta.Mapper.ExerciseMapper;
import com.gimnsio.libreta.Mapper.RoutineMapper;
import com.gimnsio.libreta.domain.Routine;
import com.gimnsio.libreta.domain.User;
import com.gimnsio.libreta.persistence.entities.RoutineEntity;
import com.gimnsio.libreta.persistence.entities.UserEntity;
import com.gimnsio.libreta.persistence.repositories.RoutineRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class RoutineServiceImpl implements RoutineService {

    final private RoutineRepository routineRepository;

    final private RoutineMapper routineMapper;
    final private ExerciseMapper exerciseMapper;

    public RoutineServiceImpl (RoutineRepository routineRepository,RoutineMapper routineMapper,ExerciseMapper exerciseMapper){
        this.routineMapper=routineMapper;
        this.routineRepository=routineRepository;
        this.exerciseMapper= exerciseMapper;
    }

    @Override
    public List<Routine> getAllRoutines(Pageable pageable) {
        return routineRepository.findAll(pageable).stream().map(routineEntity -> {
            return routineMapper.mapRoutine(routineEntity);
        }).collect(Collectors.toList());
    }

    @Override
    public Routine getRoutineById(long id) {

        Optional<RoutineEntity> routineEntityOptional = routineRepository.findById(id);

        if(routineEntityOptional.isPresent()){
            return routineMapper.mapRoutine(routineEntityOptional.get());
        }else {
            throw new NoSuchElementException("No se encontró la rutina con ID: " + id);
        }
    }

    @Override
    public List<Routine> getRoutinesByUser(User user) {
        return null;
    }

    @Override
    public Routine createRoutine(Routine routine) {
        routineRepository.save(routineMapper.mapRoutineEntity(routine));
        return routine;
    }

//    @Override
//    public Routine updateRoutine(long id, Routine routine) {
//
//        Optional<RoutineEntity> routineEntityOptional= routineRepository.findById(id);
//
//        if(routineEntityOptional.isPresent()){
//            RoutineEntity routineEntity = routineEntityOptional.get();
//
//            // Actualiza los ejercicios de la rutina
//            routineEntity.setExercises(routine.getExercises().stream().map(exercise -> {
//                return exerciseMapper.mapExerciseEntity(exercise);
//            }).collect(Collectors.toList()));
//            // ... Actualiza otros campos según tus necesidades ...
//
//        }
//
//        return routine;
//    }

    @Override
    public void deleteRoutine(long id) {
        Optional<RoutineEntity> routineEntityOptional = routineRepository.findById(id);

        if(routineEntityOptional.isPresent()){
            routineRepository.deleteById(id);//TODO FALLA org.postgresql.util.PSQLException: ERROR: update or delete on table "exercises" violates foreign key constraint "fk58bhggitkrg5uyg7s7qwtevsu" on table "routine_exercise"
        }else{
            throw new NoSuchElementException("No se encontró la rutina con ID: " + id);
        }

    }
}
