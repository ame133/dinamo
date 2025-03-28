package com.dinamo.dinamo.controller;

import com.dinamo.dinamo.models.Actividad;
import com.dinamo.dinamo.services.ActividadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/actividades")
public class ActividadController {

    @Autowired
    private ActividadService actividadService;

    @GetMapping
    public List<Actividad> listarActividades() {
        return actividadService.listarActividades();
    }

    @GetMapping("/{id}")
    public Optional<Actividad> obtenerActividad(@PathVariable Integer id) {
        return actividadService.obtenerActividadPorId(id);
    }

    @PostMapping
    public Actividad crearActividad(@RequestBody Actividad actividad) {
        return actividadService.guardarActividad(actividad);
    }

    @DeleteMapping("/{id}")
    public void eliminarActividad(@PathVariable Integer id) {
        actividadService.eliminarActividad(id);
    }
}