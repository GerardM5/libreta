package com.gimnsio.libreta.domain;

import com.gimnsio.libreta.persistence.entities.RoleEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserE {

    private Long id;
    private String name;
    private String email;
    private String password;
    private Set<Routine> routines;
    private Set<RoleEntity> roles;

}
