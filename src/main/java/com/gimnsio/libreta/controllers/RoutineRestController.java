package com.gimnsio.libreta.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/routines")
@Tag(name = "API GYM",
        description = "CRUD de Rutinas")
public class RoutineRestController {
}
