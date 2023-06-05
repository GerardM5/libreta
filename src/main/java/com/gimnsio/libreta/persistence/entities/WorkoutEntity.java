package com.gimnsio.libreta.persistence.entities;

import com.gimnsio.libreta.domain.Serie;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;
@Data
@NoArgsConstructor
@Entity(name = "workouts")
public class WorkoutEntity {
    @Id
    private Long id;
    @ManyToMany
    @JoinTable(
            name = "workout_series",
            joinColumns = @JoinColumn(name = "workout_id"),
            inverseJoinColumns = @JoinColumn(name = "serie_id")
    )
    private Set<SerieEntity> exercisesOfWorkout;
    private Date date;
}
