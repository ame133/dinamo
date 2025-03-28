package com.dinamo.dinamo.controller;

import com.dinamo.dinamo.models.MensajeChatbot;
import com.dinamo.dinamo.services.MensajeChatbotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mensajes-chatbot")
public class MensajeChatbotController {

    @Autowired
    private MensajeChatbotService mensajeChatbotService;

    @GetMapping
    public List<MensajeChatbot> listarMensajes() {
        return mensajeChatbotService.listarMensajes();
    }

    @GetMapping("/{id}")
    public Optional<MensajeChatbot> obtenerMensaje(@PathVariable Integer id) {
        return mensajeChatbotService.obtenerMensajePorId(id);
    }

    @PostMapping
    public MensajeChatbot crearMensaje(@RequestBody MensajeChatbot mensajeChatbot) {
        return mensajeChatbotService.guardarMensaje(mensajeChatbot);
    }

    @DeleteMapping("/{id}")
    public void eliminarMensaje(@PathVariable Integer id) {
        mensajeChatbotService.eliminarMensaje(id);
    }
}