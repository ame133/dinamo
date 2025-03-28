package com.dinamo.dinamo.services;

import com.dinamo.dinamo.models.OpcionRespuesta;
import com.dinamo.dinamo.repositories.OpcionRespuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OpcionRespuestaService {

    @Autowired
    private OpcionRespuestaRepository opcionRespuestaRepository;

    public List<OpcionRespuesta> listarOpciones() {
        return opcionRespuestaRepository.findAll();
    }

    public Optional<OpcionRespuesta> obtenerOpcionPorId(Integer id) {
        return opcionRespuestaRepository.findById(id);
    }

    public OpcionRespuesta guardarOpcion(OpcionRespuesta opcionRespuesta) {
        return opcionRespuestaRepository.save(opcionRespuesta);
    }

    public void eliminarOpcion(Integer id) {
        opcionRespuestaRepository.deleteById(id);
    }
}