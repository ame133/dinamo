package com.dinamo.dinamo.services;

import com.dinamo.dinamo.models.RespuestaUsuario;
import com.dinamo.dinamo.repositories.RespuestaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RespuestaUsuarioService {

    @Autowired
    private RespuestaUsuarioRepository respuestaUsuarioRepository;

    public List<RespuestaUsuario> listarRespuestasUsuario() {
        return respuestaUsuarioRepository.findAll();
    }

    public Optional<RespuestaUsuario> obtenerRespuestaPorId(Integer id) {
        return respuestaUsuarioRepository.findById(id);
    }

    public RespuestaUsuario guardarRespuesta(RespuestaUsuario respuestaUsuario) {
        return respuestaUsuarioRepository.save(respuestaUsuario);
    }

    public void eliminarRespuesta(Integer id) {
        respuestaUsuarioRepository.deleteById(id);
    }
}