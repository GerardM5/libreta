package com.gimnsio.libreta.Mapper;

import com.gimnsio.libreta.domain.User;
import com.gimnsio.libreta.persistence.entities.UserEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-12T15:27:37+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User mapUser(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        User user = new User();

        user.setId( userEntity.getId() );
        user.setRole( userEntity.getRole() );
        user.setName( userEntity.getName() );
        user.setMail( userEntity.getMail() );
        user.setPassword( userEntity.getPassword() );

        return user;
    }

    @Override
    public UserEntity mapUserEntity(User user) {
        if ( user == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( user.getId() );
        userEntity.setRole( user.getRole() );
        userEntity.setName( user.getName() );
        userEntity.setMail( user.getMail() );
        userEntity.setPassword( user.getPassword() );

        return userEntity;
    }
}
