package com.gimnsio.libreta.services;

import com.gimnsio.libreta.Mapper.MuscleMapper;
import com.gimnsio.libreta.domain.Muscle;
import com.gimnsio.libreta.persistence.entities.MuscleEntity;
import com.gimnsio.libreta.persistence.repositories.MuscleRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class MuscleServiceImpl implements  MuscleService{

    MuscleMapper muscleMapper;

    MuscleRepository muscleRepository;

    public MuscleServiceImpl(MuscleMapper muscleMapper, MuscleRepository muscleRepository){
        this.muscleRepository = muscleRepository;
        this.muscleMapper=muscleMapper;
    }
    @Override
    public List<Muscle> getAllMuscles(Pageable pageable) {

        return this.muscleRepository.findAll(pageable).stream().map(muscleEntity -> {
            return muscleMapper.mapMuscle(muscleEntity);
        }).collect(Collectors.toList());

    }

    @Override
    public Muscle getMuscleById(Long id) {
        Optional<MuscleEntity> optionalMuscleEntity = muscleRepository.findById(id);
        if (optionalMuscleEntity.isPresent()){
            return muscleMapper.mapMuscle(optionalMuscleEntity.get());
        } else {
            throw new NoSuchElementException("No se encontró el musculo con el ID: " + id);
        }
    }

    @Override
    public Muscle updateMuscle(Long id, Muscle muscle) {
        Optional<MuscleEntity> optionalMuscleEntity = muscleRepository.findById(id);
        if (optionalMuscleEntity.isPresent()){

            MuscleEntity muscleEntity = muscleMapper.mapMuscleEntity(muscle);
            muscleEntity.setId(id);
            return muscleMapper.mapMuscle(muscleRepository.save(muscleEntity));
        } else {
            throw new NoSuchElementException("No se encontró el musculo con el ID: " + id);
        }
    }

    @Override
    public Muscle createMuscle(Muscle muscle) {
        return muscleMapper.mapMuscle(muscleRepository.save(muscleMapper.mapMuscleEntity(muscle)));
    }

    @Override
    public void deleteMuscle(Long id) {
        Optional<MuscleEntity> optionalMuscleEntity = muscleRepository.findById(id);
        if (optionalMuscleEntity.isPresent()){
            muscleRepository.delete(optionalMuscleEntity.get());
        } else {
            throw new NoSuchElementException("No se encontró el musculo con el ID: " + id);
        }
    }
}
