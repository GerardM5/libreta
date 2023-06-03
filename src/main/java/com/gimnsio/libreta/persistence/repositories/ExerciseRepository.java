package com.gimnsio.libreta.persistence.repositories;

import com.gimnsio.libreta.domain.Muscle;
import com.gimnsio.libreta.persistence.entities.ExerciseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ExerciseRepository extends JpaRepository<ExerciseEntity, Long> {

//    @Query("FROM ExerciseEntity e JOIN e.muscles m WHERE m = :muscle")
//    public Set<ExerciseEntity> findByMuscle(Muscle muscle);
    @Query(value = "select * from exercises where id in (select exercise_id from muscles_exercises where muscle_id = :muscle_id)", nativeQuery=true)
    public Set<ExerciseEntity> findByMuscle(Long muscle_id);


}
