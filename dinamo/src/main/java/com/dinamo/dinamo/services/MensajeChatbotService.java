package com.dinamo.dinamo.services;

import com.dinamo.dinamo.models.MensajeChatbot;
import com.dinamo.dinamo.repositories.MensajeChatbotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MensajeChatbotService {

    @Autowired
    private MensajeChatbotRepository mensajeChatbotRepository;

    public List<MensajeChatbot> listarMensajes() {
        return mensajeChatbotRepository.findAll();
    }

    public Optional<MensajeChatbot> obtenerMensajePorId(Integer id) {
        return mensajeChatbotRepository.findById(id);
    }

    public MensajeChatbot guardarMensaje(MensajeChatbot mensajeChatbot) {
        return mensajeChatbotRepository.save(mensajeChatbot);
    }

    public void eliminarMensaje(Integer id) {
        mensajeChatbotRepository.deleteById(id);
    }
}
