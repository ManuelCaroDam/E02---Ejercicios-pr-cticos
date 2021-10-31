package com.E02example.E02sql.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter @Setter
@AllArgsConstructor
@Builder
public class Producto {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private double precio;
    private String imagen;
    private String descripcion;



}
