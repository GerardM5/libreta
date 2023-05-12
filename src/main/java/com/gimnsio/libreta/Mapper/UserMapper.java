package com.gimnsio.libreta.Mapper;

import com.gimnsio.libreta.domain.Exercise;
import com.gimnsio.libreta.domain.User;
import com.gimnsio.libreta.persistence.entities.ExerciseEntity;
import com.gimnsio.libreta.persistence.entities.UserEntity;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UserMapper {

    public User mapUser(UserEntity userEntity);

    public UserEntity mapUserEntity(User user);

}
