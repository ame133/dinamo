package com.dinamo.dinamo.controller;

import com.dinamo.dinamo.models.Progreso;
import com.dinamo.dinamo.services.ProgresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/progreso")
public class ProgresoController {

    @Autowired
    private ProgresoService progresoService;

    @GetMapping
    public List<Progreso> listarProgresos() {
        return progresoService.listarProgresos();
    }

    @GetMapping("/{id}")
    public Optional<Progreso> obtenerProgreso(@PathVariable Integer id) {
        return progresoService.obtenerProgresoPorId(id);
    }

    @PostMapping
    public Progreso crearProgreso(@RequestBody Progreso progreso) {
        return progresoService.guardarProgreso(progreso);
    }

    @DeleteMapping("/{id}")
    public void eliminarProgreso(@PathVariable Integer id) {
        progresoService.eliminarProgreso(id);
    }
}