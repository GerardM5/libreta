package com.gimnsio.libreta.controllers;

import com.gimnsio.libreta.domain.UserE;
import com.gimnsio.libreta.services.UsersService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;


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
    public ResponseEntity<?> createUser(@RequestBody UserE userE){
        return ResponseEntity.ok(usersService.createUser(userE));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> editUser(@RequestBody UserE userE, @PathVariable Long id){
        return ResponseEntity.ok(usersService.updateUser(id, userE));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        usersService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }


}
