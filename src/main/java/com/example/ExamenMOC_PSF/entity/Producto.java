package com.example.ExamenMOC_PSF.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private String categoria;
    @Column
    private float precio;
    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;
    @Column
    private String observaciones;
    @Column
    private Integer cantidad;

    @OneToMany(mappedBy = "producto")
    private List<Pedido> pedidos;
}
