package com.gimnsio.libreta.persistence.repositories;

import com.gimnsio.libreta.persistence.entities.RoutineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoutineRepository extends JpaRepository<RoutineEntity,Long> {
}
