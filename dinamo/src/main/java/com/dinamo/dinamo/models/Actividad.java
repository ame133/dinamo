package com.dinamo.dinamo.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "actividad")
@Data
public class Actividad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;
    private String descripcion;

    @Enumerated(EnumType.STRING)
    private TipoActividad tipo;

    @ManyToOne
    @JoinColumn(name = "id_modulo", nullable = false)
    private Modulo modulo;

    @OneToMany(mappedBy = "actividad", cascade = CascadeType.ALL)
    private List<Pregunta> preguntas;
}