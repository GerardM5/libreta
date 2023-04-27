package com.gimnsio.libreta.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseOfWorkout {
    private String name;
    private List<Set> sets;


}
