package com.example.ExamenMOC_PSF.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private LocalDate fecha;

    @Column
    private Integer cantidad;

    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "id_producto")
    private Long idProducto;
}
