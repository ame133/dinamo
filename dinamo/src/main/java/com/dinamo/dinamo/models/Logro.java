package com.dinamo.dinamo.models;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "logros")
@Data
public class Logro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    private String titulo;
    private String descripcion;
}