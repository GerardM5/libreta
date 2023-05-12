package com.gimnsio.libreta.domain;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Muscle {

    @NotNull
    private Long id;
    private String name;
    private String image;
    private String muscleGroup;
}
