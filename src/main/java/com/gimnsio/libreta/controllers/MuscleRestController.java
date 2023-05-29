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

    private MuscleService muscleService;

    public MuscleRestController(MuscleService muscleService ) {

        this.muscleService = muscleService;
    }

    @GetMapping
    public ResponseEntity<List<Muscle>> obtenerMusculos(@PageableDefault(size = 5)
                                            Pageable pageable) {
        return ResponseEntity.ok(this.muscleService.getAllMuscles(pageable));
    }

//    @PostMapping
//    public Muscle crearMusculo(@RequestBody Muscle musculo) {
//        return muscleRepository.save(musculo);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Muscle> obtenerMusculoPorId(@PathVariable Long id) {
//        Optional<Muscle> musculo = muscleRepository.findById(id);
//        if (musculo.isPresent()) {
//            return ResponseEntity.ok(musculo.get());
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Muscle> actualizarMusculo(@PathVariable Long id, @RequestBody Muscle musculoActualizado) {
//        Optional<Muscle> musculo = muscleRepository.findById(id);
//        if (musculo.isPresent()) {
//            Muscle musculoExistente = musculo.get();
//            musculoExistente.setName(musculoActualizado.getName());
//            // Actualizar otros atributos según sea necesario
//
//            Muscle musculoActualizadoEntity = muscleRepository.save(musculoExistente);
//            return ResponseEntity.ok(musculoActualizadoEntity);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> eliminarMusculo(@PathVariable Long id) {
//        Optional<Muscle> musculo = muscleRepository.findById(id);
//        if (musculo.isPresent()) {
//            muscleRepository.delete(musculo.get());
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
}

