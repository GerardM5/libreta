package com.gimnsio.libreta.services;


import com.gimnsio.libreta.domain.Muscle;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MuscleService {

    public List<Muscle> getAllMuscles(Pageable pageable);
}
