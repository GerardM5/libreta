package com.gimnsio.libreta.controllers;

import com.gimnsio.libreta.domain.Muscle;
import com.gimnsio.libreta.persistence.repositories.MuscleRepository;
import com.gimnsio.libreta.services.MuscleService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/muscles")
public class MuscleRestController {

    private final MuscleService muscleService;

    public MuscleRestController(MuscleService muscleService) {

        this.muscleService = muscleService;
    }

    @GetMapping
    public ResponseEntity<List<Muscle>> getMuscles(@PageableDefault(size = 20)
                                            Pageable pageable) {
        return ResponseEntity.ok(this.muscleService.getAllMuscles(pageable));
    }

    @PostMapping
    public Muscle createMuscles(@RequestBody Muscle muscle) {
        return muscleService.createMuscle(muscle);//muscleRepository.save(musculo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Muscle> getMuscleById(@PathVariable Long id) {
        return ResponseEntity.ok(muscleService.getMuscleById(id));
//        Optional<Muscle> musculo = muscleRepository.findById(id);
//        if (musculo.isPresent()) {
//            return ResponseEntity.ok(musculo.get());
//        } else {
//            return ResponseEntity.notFound().build();
//        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateMuscle(@PathVariable Long id, @RequestBody Muscle muscle) {
        return ResponseEntity.ok(muscleService.updateMuscle(id,muscle));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMuscle(@PathVariable Long id) {
        muscleService.deleteMuscle(id);
        return ResponseEntity.noContent().build();
//        Optional<Muscle> musculo = muscleRepository.findById(id);
//        if (musculo.isPresent()) {
//            muscleRepository.delete(musculo.get());
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
    }
}

