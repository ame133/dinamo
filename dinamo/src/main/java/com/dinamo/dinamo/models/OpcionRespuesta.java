package com.dinamo.dinamo.models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "opcionesrespuesta")
@Data
public class OpcionRespuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_pregunta", nullable = false)
    private Pregunta pregunta;

    private String texto;
    private boolean esCorrecta;
}