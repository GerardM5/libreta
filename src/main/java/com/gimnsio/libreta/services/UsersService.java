package com.gimnsio.libreta.services;

import com.gimnsio.libreta.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UsersService {

    public User getUserById(long id);
    public List<User> getAllUsers();
    public User createUser(User user);
    public User updateUser(long id, User user);
    public void deleteUser(long id);

}
