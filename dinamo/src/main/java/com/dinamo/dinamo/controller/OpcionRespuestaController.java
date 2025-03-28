package com.dinamo.dinamo.controller;

import com.dinamo.dinamo.models.OpcionRespuesta;
import com.dinamo.dinamo.services.OpcionRespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/opciones-respuesta")
public class OpcionRespuestaController {

    @Autowired
    private OpcionRespuestaService opcionRespuestaService;

    @GetMapping
    public List<OpcionRespuesta> listarOpciones() {
        return opcionRespuestaService.listarOpciones();
    }

    @GetMapping("/{id}")
    public Optional<OpcionRespuesta> obtenerOpcion(@PathVariable Integer id) {
        return opcionRespuestaService.obtenerOpcionPorId(id);
    }

    @PostMapping
    public OpcionRespuesta crearOpcion(@RequestBody OpcionRespuesta opcionRespuesta) {
        return opcionRespuestaService.guardarOpcion(opcionRespuesta);
    }

    @DeleteMapping("/{id}")
    public void eliminarOpcion(@PathVariable Integer id) {
        opcionRespuestaService.eliminarOpcion(id);
    }
}