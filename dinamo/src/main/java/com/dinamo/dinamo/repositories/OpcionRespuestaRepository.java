package com.dinamo.dinamo.repositories;

import com.dinamo.dinamo.models.OpcionRespuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpcionRespuestaRepository extends JpaRepository<OpcionRespuesta, Integer> {
}