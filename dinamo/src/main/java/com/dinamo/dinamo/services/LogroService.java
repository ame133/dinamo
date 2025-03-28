package com.dinamo.dinamo.services;

import com.dinamo.dinamo.models.Logro;
import com.dinamo.dinamo.repositories.LogroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LogroService {

    @Autowired
    private LogroRepository logroRepository;

    public List<Logro> listarLogros() {
        return logroRepository.findAll();
    }

    public Optional<Logro> obtenerLogroPorId(Integer id) {
        return logroRepository.findById(id);
    }

    public Logro guardarLogro(Logro logro) {
        return logroRepository.save(logro);
    }

    public void eliminarLogro(Integer id) {
        logroRepository.deleteById(id);
    }
}