package com.gimnsio.libreta.persistence.repositories;

import com.gimnsio.libreta.persistence.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
