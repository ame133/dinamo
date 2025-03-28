package com.dinamo.dinamo.services;

import com.dinamo.dinamo.models.Actividad;
import com.dinamo.dinamo.repositories.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ActividadService {

    @Autowired
    private ActividadRepository actividadRepository;

    public List<Actividad> listarActividades() {
        return actividadRepository.findAll();
    }

    public Optional<Actividad> obtenerActividadPorId(Integer id) {
        return actividadRepository.findById(id);
    }

    public Actividad guardarActividad(Actividad actividad) {
        return actividadRepository.save(actividad);
    }

    public void eliminarActividad(Integer id) {
        actividadRepository.deleteById(id);
    }
}