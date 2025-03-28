package com.dinamo.dinamo.services;

import com.dinamo.dinamo.models.Pregunta;
import com.dinamo.dinamo.repositories.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;

    public List<Pregunta> listarPreguntas() {
        return preguntaRepository.findAll();
    }

    public Optional<Pregunta> obtenerPreguntaPorId(Integer id) {
        return preguntaRepository.findById(id);
    }

    public Pregunta guardarPregunta(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);
    }

    public void eliminarPregunta(Integer id) {
        preguntaRepository.deleteById(id);
    }
}