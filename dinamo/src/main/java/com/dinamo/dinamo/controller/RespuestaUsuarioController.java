package com.dinamo.dinamo.controller;

import com.dinamo.dinamo.models.RespuestaUsuario;
import com.dinamo.dinamo.services.RespuestaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/respuestas-usuario")
public class RespuestaUsuarioController {

    @Autowired
    private RespuestaUsuarioService respuestaUsuarioService;

    @GetMapping
    public List<RespuestaUsuario> listarRespuestasUsuario() {
        return respuestaUsuarioService.listarRespuestasUsuario();
    }

    @GetMapping("/{id}")
    public Optional<RespuestaUsuario> obtenerRespuesta(@PathVariable Integer id) {
        return respuestaUsuarioService.obtenerRespuestaPorId(id);
    }

    @PostMapping
    public RespuestaUsuario crearRespuesta(@RequestBody RespuestaUsuario respuestaUsuario) {
        return respuestaUsuarioService.guardarRespuesta(respuestaUsuario);
    }

    @DeleteMapping("/{id}")
    public void eliminarRespuesta(@PathVariable Integer id) {
        respuestaUsuarioService.eliminarRespuesta(id);
    }
}