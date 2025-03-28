package com.dinamo.dinamo.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "preguntas")
@Data
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String enuncia;

    @ManyToOne
    @JoinColumn(name = "id_actividad", nullable = false)
    private Actividad actividad;

    @OneToMany(mappedBy = "pregunta", cascade = CascadeType.ALL)
    private List<OpcionRespuesta> opcionesRespuesta;
}