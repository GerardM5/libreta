package com.gimnsio.libreta.services;

import com.gimnsio.libreta.Mapper.UserMapper;
import com.gimnsio.libreta.domain.User;
import com.gimnsio.libreta.persistence.repositories.UserRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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
    public User getUserById(long id) {

/*        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }*/

        return null;
    }

    @Override
    public List<User> getAllUsers(Pageable pageable) {
        //return users;
        return userRepository.findAll(pageable).stream().map(userEntity -> {
            return userMapper.mapUser(userEntity);
        }).collect(Collectors.toList());
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(long id, User user) {

        return null;
    }

    @Override
    public void deleteUser(long id) {

    }
}
