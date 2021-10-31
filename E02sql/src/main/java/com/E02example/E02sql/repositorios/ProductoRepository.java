package com.E02example.E02sql.repositorios;

import com.E02example.E02sql.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository <Producto, Long> {
}
