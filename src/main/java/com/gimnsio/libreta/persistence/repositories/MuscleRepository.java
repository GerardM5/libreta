package com.gimnsio.libreta.persistence.repositories;


import com.gimnsio.libreta.persistence.entities.MuscleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuscleRepository extends JpaRepository<MuscleEntity, Long> {

}