package com.gimnsio.libreta.persistence.entities;

import com.gimnsio.libreta.domain.Exercise;
import com.gimnsio.libreta.domain.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "routines")
public class RoutineEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(
            name = "routines_exercises",
            joinColumns = @JoinColumn(name = "routine_id"),
            inverseJoinColumns = @JoinColumn(name = "exercise_id")
    )
    private Set<ExerciseEntity> exercises;

    // Relación muchos a uno con la clase User
    @ManyToOne
    @JoinColumn(name = "creator")
    private UserEntity creator;

    // Constructor, getters y setters
    // ...
}
