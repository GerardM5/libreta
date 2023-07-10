package com.gimnsio.libreta.services;

import com.gimnsio.libreta.domain.UserE;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface UsersService {

    public List<UserE> getAllUsers(Pageable pageable);
    public UserE getUserById(long id);
    public UserE createUser(UserE userE);
    public UserE updateUser(long id, UserE userE);
    public void deleteUser(long id);

}
