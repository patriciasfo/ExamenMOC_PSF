package com.example.ExamenMOC_PSF.repository;

import com.example.ExamenMOC_PSF.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JPARepository<Producto, Long> {

    Producto findByNombre(String nombre);
    List<Producto> findByPrecio(float precio);
    List<Producto> findByCategoria(String categoria);
    List<Producto> findByPrecioYCategoria(float precio, String categoria);
}
