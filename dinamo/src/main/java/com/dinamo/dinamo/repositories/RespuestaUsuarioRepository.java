package com.dinamo.dinamo.repositories;

import com.dinamo.dinamo.models.RespuestaUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaUsuarioRepository extends JpaRepository<RespuestaUsuario, Integer> {
}