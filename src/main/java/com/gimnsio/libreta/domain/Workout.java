package com.gimnsio.libreta.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Workout {
    private User user;
    private Routine routine;
    private List<ExerciseOfWorkout> exercises;
}
