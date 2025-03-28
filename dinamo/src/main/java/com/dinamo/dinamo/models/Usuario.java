package com.dinamo.dinamo.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuarios")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String correo;
    private String contraseña;

    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Progreso> progresos;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<MensajeChatbot> mensajesChatbot;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Logro> logros;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<RespuestaUsuario> respuestasUsuario;
}