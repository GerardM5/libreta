package com.gimnsio.libreta.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class User {

    private Long id;
    private Long role;
    private String name;
    private String lastName;
    private List<Routine> routines;

}
