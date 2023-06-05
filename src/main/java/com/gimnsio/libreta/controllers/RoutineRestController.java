package com.gimnsio.libreta.controllers;

import com.gimnsio.libreta.domain.Routine;
import com.gimnsio.libreta.persistence.entities.RoutineEntity;
import com.gimnsio.libreta.services.RoutineService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/routines")
@Tag(name = "API GYM",
        description = "CRUD de Rutinas")
public class RoutineRestController {

    private final RoutineService routineService;

    public RoutineRestController(RoutineService routineService){
        this.routineService=routineService;
    }


    @GetMapping
    public ResponseEntity<?> getAllRoutines(
            @PageableDefault(size = 5)
            Pageable pageable){
        return ResponseEntity.ok(this.routineService.getAllRoutines(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getRoutineById(@PathVariable Long id){
        return ResponseEntity.ok(this.routineService.getRoutineById(id));
    }

    @PostMapping
    public ResponseEntity<?> createRoutine(@RequestBody Routine routine){
        return ResponseEntity.ok(this.routineService.createRoutine(routine));//TODO FALLA
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateRoutine(@PathVariable Long id,@RequestBody Routine routine){
        return ResponseEntity.ok(this.routineService.updateRoutine(id,routine));//TODO Modificar para que dentro le pase solo X ejercicios y los modifique
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRoutine(@PathVariable Long id){
        this.routineService.deleteRoutine(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getRoutineByUser(@PathVariable Long id){
        return ResponseEntity.ok(this.routineService.getRoutinesByUser(id));
    }
}
