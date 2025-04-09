package com.dinamo.dinamo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor

/*TO DO Corregir relaciones onetomany ya que andan dando "conflictos"*/

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonProperty("nombre")  // Asegura que Jackson reconozca este campo
    private String nombre;

    @JsonProperty("correo")
    private String correo;

    @JsonProperty("contraseña")
    private String contraseña;

    @Column(name = "fecha_registro", nullable = false)
    private LocalDateTime fechaRegistro;

    @PrePersist
    protected void onCreate() {
        this.fechaRegistro = LocalDateTime.now();
    }

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Progreso> progresos;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<MensajeChatbot> mensajesChatbot;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Logro> logros;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<RespuestaUsuario> respuestasUsuario;
}