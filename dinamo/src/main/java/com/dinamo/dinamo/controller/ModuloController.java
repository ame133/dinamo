package com.dinamo.dinamo.controller;

import com.dinamo.dinamo.models.Modulo;
import com.dinamo.dinamo.services.ModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/modulos")
public class ModuloController {

    @Autowired
    private ModuloService moduloService;

    @GetMapping
    public List<Modulo> listarModulos() {
        return moduloService.listarModulos();
    }

    @GetMapping("/{id}")
    public Optional<Modulo> obtenerModulo(@PathVariable Integer id) {
        return moduloService.obtenerModuloPorId(id);
    }

    @PostMapping
    public Modulo crearModulo(@RequestBody Modulo modulo) {
        return moduloService.guardarModulo(modulo);
    }

    @DeleteMapping("/{id}")
    public void eliminarModulo(@PathVariable Integer id) {
        moduloService.eliminarModulo(id);
    }
}