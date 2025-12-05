package com.example.ExamenMOC_PSF.service;

import com.example.ExamenMOC_PSF.entity.Producto;
import com.example.ExamenMOC_PSF.repository.ProductoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
public class ProductoServiceTest {
    @Mock
    ProductoRepository productoRepository;

    @InjectMocks
    ProductoServiceImpl servicio;

    @Test
    public void testGetProducto() {
        Producto esperado = new Producto(1L, "prod1", "desc", "cat1", 2.4f, null, "observaciones", 3);
        Mockito.when(this.productoRepository.findById(1L)).thenReturn(Optional.of(esperado));
        Optional<Producto> resultado = servicio.findProducto(1L);
        if (resultado.isPresent()) {
            assertEquals(esperado, resultado.get());
        }
    }
}
