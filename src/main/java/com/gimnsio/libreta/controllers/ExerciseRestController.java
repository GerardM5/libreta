package com.gimnsio.libreta.controllers;

import com.gimnsio.libreta.domain.Exercise;
import com.gimnsio.libreta.domain.Muscle;
import com.gimnsio.libreta.services.ExerciseService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exercises")
@Tag(name = "Ejercicios",
        description = "CRUD de Ejercicios")
public class ExerciseRestController {

    private ExerciseService exerciseService;

    public ExerciseRestController(ExerciseService exerciseService){
        this.exerciseService=exerciseService;
    }


    @GetMapping
    public ResponseEntity<?> getAllExercises(
            @PageableDefault(size = 20)
            Pageable pageable){

        return ResponseEntity.ok(this.exerciseService.getAllExercises(pageable));

    }


    @GetMapping("{id}")
    public ResponseEntity<?> getExerciseById(@PathVariable Long id){
        return ResponseEntity.ok(exerciseService.getExerciseById(id));
    }

//    @GetMapping("/type/{type}")
//    public ResponseEntity<?> getExercisesByType(@PathVariable String type,
//                                                @PageableDefault(size = 5) Pageable pageable){
//        return ResponseEntity.ok(exerciseService.getExercisesByType(type,pageable));
//    }
//
    @GetMapping("/muscle/{muscle_id}")
    public ResponseEntity<?> getExercisesByMuscle(@PathVariable Long muscle_id){
        return ResponseEntity.ok(exerciseService.getExercisesByMuscle(muscle_id));
    }
//
//    @GetMapping("/muscle/{muscleId}/type/{type}")
//    public ResponseEntity<?> getExercisesByMuscleAndType(@PathVariable Long muscleId,
//                                                         @PathVariable String type,
//                                                         @PageableDefault(size=5) Pageable pageable){
//        return ResponseEntity.ok(exerciseService.getExercisesByMuscleAndType(muscleId,type,pageable));
//    }
    @PutMapping("/{id}")
    public ResponseEntity<Exercise> updateExercise(@PathVariable Long id, @RequestBody Exercise exercise){
        return ResponseEntity.ok(exerciseService.updateExercise(id,exercise));
    }

    @PostMapping
    public ResponseEntity<?> createExercise(@RequestBody Exercise exercise){
        return ResponseEntity.ok(exerciseService.createExercise(exercise));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteExercise(@PathVariable Long id){
        exerciseService.deleteExercise(id);
        return ResponseEntity.noContent().build();
    }


}
