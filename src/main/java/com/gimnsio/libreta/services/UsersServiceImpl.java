package com.gimnsio.libreta.services;

import com.gimnsio.libreta.Mapper.UserMapper;
import com.gimnsio.libreta.domain.UserE;
import com.gimnsio.libreta.persistence.entities.UserEntity;
import com.gimnsio.libreta.persistence.repositories.UserRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsersServiceImpl implements UsersService {

    private UserRepository userRepository;
    private UserMapper userMapper;

    public UsersServiceImpl(UserRepository userRepository,UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserE getUserById(long id) {

        Optional<UserEntity> userEntityOptional = userRepository.findById(id);
        if(userEntityOptional.isPresent()){

            return userMapper.mapUser(userEntityOptional.get());
        }else {
            throw new NoSuchElementException("No se encontró el usuario con el ID: " + id);
        }
    }

    @Override
    public List<UserE> getAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable).stream().map(userEntity -> {
            return userMapper.mapUser(userEntity);
        }).collect(Collectors.toList());
    }

    @Override
    public UserE createUser(UserE userE) {
        UserEntity userEntity = userMapper.mapUserEntity(userE);
        UserEntity newUserEntity = userRepository.save(userEntity);
        return userE;
    }

    @Override
    public UserE updateUser(long id, UserE userE) {

        Optional<UserEntity> userEntityOptional = userRepository.findById(id);

        if (userEntityOptional.isPresent()) {
            UserEntity userEntity = userEntityOptional.get();
            userEntity = userMapper.mapUserEntity(userE);
            userEntity.setId(id);//TODO Cambiar chapuza
            return userMapper.mapUser(userRepository.save(userEntity));
        } else {
            throw new NoSuchElementException("No se encontró el usuario con el ID: " + id);
        }
    }

    @Override
    public void deleteUser(long id) {
        Optional<UserEntity> userEntityOptional = userRepository.findById(id);

        if (userEntityOptional.isPresent()) {
            userRepository.deleteById(id);
        } else {
            throw new NoSuchElementException("No se encontró el usuario con el ID: " + id);
        }
    }
}
