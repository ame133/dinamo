package com.dinamo.dinamo.services;

import com.dinamo.dinamo.models.Modulo;
import com.dinamo.dinamo.repositories.ModuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ModuloService {

    @Autowired
    private ModuloRepository moduloRepository;

    public List<Modulo> listarModulos() {
        return moduloRepository.findAll();
    }

    public Optional<Modulo> obtenerModuloPorId(Integer id) {
        return moduloRepository.findById(id);
    }

    public Modulo guardarModulo(Modulo modulo) {
        return moduloRepository.save(modulo);
    }

    public void eliminarModulo(Integer id) {
        moduloRepository.deleteById(id);
    }
}