package com.gimnsio.libreta.persistence.repositories;

import com.gimnsio.libreta.persistence.entities.SerieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends JpaRepository<SerieEntity,Long> {
}
