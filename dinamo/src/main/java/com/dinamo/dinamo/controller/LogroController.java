package com.dinamo.dinamo.controller;

import com.dinamo.dinamo.models.Logro;
import com.dinamo.dinamo.services.LogroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/logros")
public class LogroController {

    @Autowired
    private LogroService logroService;

    @GetMapping
    public List<Logro> listarLogros() {
        return logroService.listarLogros();
    }

    @GetMapping("/{id}")
    public Optional<Logro> obtenerLogro(@PathVariable Integer id) {
        return logroService.obtenerLogroPorId(id);
    }

    @PostMapping
    public Logro crearLogro(@RequestBody Logro logro) {
        return logroService.guardarLogro(logro);
    }

    @DeleteMapping("/{id}")
    public void eliminarLogro(@PathVariable Integer id) {
        logroService.eliminarLogro(id);
    }
}