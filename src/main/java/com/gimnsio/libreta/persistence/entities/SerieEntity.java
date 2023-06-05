package com.gimnsio.libreta.persistence.entities;

import com.gimnsio.libreta.domain.Exercise;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name="series")
public class SerieEntity {
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private ExerciseEntity exercise;
    private int reps;
    private int kg;
}
