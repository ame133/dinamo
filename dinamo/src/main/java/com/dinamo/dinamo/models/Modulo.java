package com.dinamo.dinamo.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "modulos")
@Data
public class Modulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String descripcion;
    private String icono;

    @OneToMany(mappedBy = "modulo", cascade = CascadeType.ALL)
    private List<Actividad> actividades;

    @OneToMany(mappedBy = "modulo", cascade = CascadeType.ALL)
    private List<Progreso> progresos;
}