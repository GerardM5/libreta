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
@Tag(name = "Usuarios",
        description = "CRUD de usurarios")
public class UserRestController {

    private UsersService usersService;

    public UserRestController(UsersService usersService){
        this.usersService = usersService;
    }

    @GetMapping
    public ResponseEntity<?> getAllUsers(
            @PageableDefault(size = 5)
            Pageable pageable){

        return ResponseEntity.ok(this.usersService.getAllUsers(pageable));

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable long id){
        return ResponseEntity.ok(usersService.getUserById(id));
    }
    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user){
        return ResponseEntity.ok(usersService.createUser(user));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> editUser(@RequestBody User user, @PathVariable Long id){
        return ResponseEntity.ok(usersService.updateUser(id,user));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        usersService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }


}
