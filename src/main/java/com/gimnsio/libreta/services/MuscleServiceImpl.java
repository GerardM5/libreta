package com.gimnsio.libreta.services;

import com.gimnsio.libreta.Mapper.MuscleMapper;
import com.gimnsio.libreta.domain.Muscle;
import com.gimnsio.libreta.persistence.repositories.MuscleRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
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
}
