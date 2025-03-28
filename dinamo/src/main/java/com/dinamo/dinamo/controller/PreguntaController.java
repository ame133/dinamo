package com.dinamo.dinamo.controller;

import com.dinamo.dinamo.models.Pregunta;
import com.dinamo.dinamo.services.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/preguntas")
public class PreguntaController {

    @Autowired
    private PreguntaService preguntaService;

    @GetMapping
    public List<Pregunta> listarPreguntas() {
        return preguntaService.listarPreguntas();
    }

    @GetMapping("/{id}")
    public Optional<Pregunta> obtenerPregunta(@PathVariable Integer id) {
        return preguntaService.obtenerPreguntaPorId(id);
    }

    @PostMapping
    public Pregunta crearPregunta(@RequestBody Pregunta pregunta) {
        return preguntaService.guardarPregunta(pregunta);
    }

    @DeleteMapping("/{id}")
    public void eliminarPregunta(@PathVariable Integer id) {
        preguntaService.eliminarPregunta(id);
    }
}