package com.gimnsio.libreta.Mapper;

import com.gimnsio.libreta.domain.UserE;
import com.gimnsio.libreta.persistence.entities.UserEntity;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UserMapper {


    public UserE mapUser(UserEntity userEntity);

    public UserEntity mapUserEntity(UserE userE);

}
