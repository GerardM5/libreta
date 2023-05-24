package com.gimnsio.libreta.domain;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private Long id;
    private Long role;
    private String name;
    private String email;
    private String password;
    //private List<Routine> routines;

}
