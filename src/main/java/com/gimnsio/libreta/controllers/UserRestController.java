package com.gimnsio.libreta.controllers;

import com.gimnsio.libreta.domain.User;
import com.gimnsio.libreta.services.UsersService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/users")
@Tag(name = "API GYM",
        description = "CRUD de usurarios")
public class UserRestController {

    private UsersService usersService;

    public UserRestController(UsersService usersService){
        this.usersService = usersService;
    }

    //Almacen provisional
/*    ArrayList<User>users = new ArrayList<>(
            List.of(new User(1,"pablo","Mata"),
                    new User(2,"Gerard", "Martinez"),
                    new User(3,"Celeste", "Cañete")

    ));*/

    @GetMapping
    public ResponseEntity<?> getAllUsers(
            @PageableDefault(size = 5)
            Pageable pageable){

        return ResponseEntity.ok(this.usersService.getAllUsers(pageable));

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable long id){

        //return this.usersService.getUserById(id);

        return ResponseEntity.ok(usersService.getUserById(id));
    }
    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user){
        usersService.createUser(user);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/{id}")
    public ResponseEntity<?> editUser(@RequestBody User user, @PathVariable Long id){
        User user1 = usersService.updateUser(id,user);
        return ResponseEntity.ok(user1);
    }


}
