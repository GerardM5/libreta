package com.gimnsio.libreta.Mapper;

import com.gimnsio.libreta.domain.UserE;
import com.gimnsio.libreta.persistence.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Mapper(componentModel = "spring")
public interface UserMapper {

    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    public UserE mapUser(UserEntity userEntity);
    @Mappings({
            @Mapping(target = "password", expression = "java(passwordEncoder.encode(userE.getPassword()))")
    })
    public UserEntity mapUserEntity(UserE userE);

}
