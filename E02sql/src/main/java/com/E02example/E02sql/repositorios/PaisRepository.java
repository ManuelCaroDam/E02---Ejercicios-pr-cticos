package com.E02example.E02sql.repositorios;

import com.E02example.E02sql.entidades.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepository extends JpaRepository <Pais, Long> {
}
