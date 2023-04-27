package com.gimnsio.libreta.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Routine {
    private List<Exercise> exercises;
    private User creator;

}
