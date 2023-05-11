package com.gimnsio.libreta.services;

import com.gimnsio.libreta.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {


 //   List<User> users = new ArrayList<>(
//            List.of(new User(1, "pablo", "Mata"),
//                    new User(2, "Gerard", "Martinez"),
//                    new User(3, "Celeste", "Cañete")));


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
    public List<User> getAllUsers() {
        //return users;
        return null;
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
