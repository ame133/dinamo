package com.dinamo.dinamo.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "mensajeschatbot")
@Data
public class MensajeChatbot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column(columnDefinition = "TEXT")
    private String mensajeUsuario;

    @Column(columnDefinition = "TEXT")
    private String respuestaBot;
}