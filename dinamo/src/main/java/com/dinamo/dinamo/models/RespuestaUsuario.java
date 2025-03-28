package com.dinamo.dinamo.models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "respuestasusuario")
@Data
public class RespuestaUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_pregunta", nullable = false)
    private Pregunta pregunta;

    @ManyToOne
    @JoinColumn(name = "id_opcion", nullable = false)
    private OpcionRespuesta opcion;
}