package com.gimnsio.libreta.services;


import com.gimnsio.libreta.domain.Muscle;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MuscleService {

    public List<Muscle> getAllMuscles(Pageable pageable);

    public Muscle getMuscleById(Long id);

    public Muscle updateMuscle(Long id, Muscle muscle);

    public Muscle createMuscle(Muscle muscle);

    public void deleteMuscle(Long id);
}
