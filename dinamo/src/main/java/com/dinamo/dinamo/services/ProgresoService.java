package com.dinamo.dinamo.services;

import com.dinamo.dinamo.models.Progreso;
import com.dinamo.dinamo.repositories.ProgresoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProgresoService {

    @Autowired
    private ProgresoRepository progresoRepository;

    public List<Progreso> listarProgresos() {
        return progresoRepository.findAll();
    }

    public Optional<Progreso> obtenerProgresoPorId(Integer id) {
        return progresoRepository.findById(id);
    }

    public Progreso guardarProgreso(Progreso progreso) {
        return progresoRepository.save(progreso);
    }

    public void eliminarProgreso(Integer id) {
        progresoRepository.deleteById(id);
    }
}