package com.gimnsio.libreta.controllers;

import com.gimnsio.libreta.services.ExerciseService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercises")
@Tag(name = "API GYM",
        description = "CRUD de Ejercicios")
public class ExerciseRestController {

    private ExerciseService exerciseService;

    public ExerciseRestController(ExerciseService exerciseService){
        this.exerciseService=exerciseService;
    }


    @GetMapping
    public ResponseEntity<?> getAllExercises(
            @PageableDefault(size = 5)
            Pageable pageable){

        return ResponseEntity.ok(this.exerciseService.getAllExercises(pageable));

    }


    @GetMapping("{id}")
    public ResponseEntity<?> getExerciseById(@PathVariable Long id){
        return ResponseEntity.ok(exerciseService.getExerciseById(id));
    }

    @GetMapping("/type/{type}")
    public ResponseEntity<?> getExercisesByType(@PathVariable String type,
                                                @PageableDefault(size = 5) Pageable pageable){
        return ResponseEntity.ok(exerciseService.getExercisesByType(type,pageable));
    }

    @GetMapping("/muscle/{muscleId}")
    public ResponseEntity<?> getExercisesByMuscle(@PathVariable Long muscleId,
                                                  @PageableDefault(size=5) Pageable pageable){
        return ResponseEntity.ok(exerciseService.getExercisesByMuscle(muscleId,pageable));
    }

    @GetMapping("/muscle/{muscleId}/type/{type}")
    public ResponseEntity<?> getExercisesByMuscleAndType(@PathVariable Long muscleId,
                                                         @PathVariable String type,
                                                         @PageableDefault(size=5) Pageable pageable){
        return ResponseEntity.ok(exerciseService.getExercisesByMuscleAndType(muscleId,type,pageable));
    }


}
