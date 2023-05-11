package com.gimnsio.libreta.persistence.repositories;

import com.gimnsio.libreta.persistence.entities.ExerciseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;

import java.util.List;

@Repository
public interface ExerciseRepository extends JpaRepository<ExerciseEntity, Long> {

//    public List<ExerciseEntity> findByType(String type, Pageable pageable);
//
//    public List<ExerciseEntity> findByMuscle(Long muscle_id, Pageable pageable);
//
//    public List<ExerciseEntity> findByMuscleAndType(Long muscleId, String type, Pageable pageable);
}
