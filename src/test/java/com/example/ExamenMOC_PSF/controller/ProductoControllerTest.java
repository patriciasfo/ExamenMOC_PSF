package com.example.ExamenMOC_PSF.controller;

import com.example.ExamenMOC_PSF.entity.Producto;
import com.example.ExamenMOC_PSF.service.ProductoServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductoControllerTest {

    @InjectMocks
    private ProductoController productoController;

    @Mock
    ProductoServiceImpl servicio;

    @Test
    void testAddProducto()
    {
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        Producto esperado = new Producto(1L, "prod1", "desc", "cat1", 2.4f, null, "observaciones", 3);
        when(servicio.addProducto(any(Producto.class))).thenReturn(esperado);

        Producto respuesta = this.productoController.addProducto(new Producto(1L, "prod1", "desc", "cat1", 2.4f, null, "observaciones", 3));
        Assertions.assertEquals(respuesta, esperado);
        Mockito.verify(this.servicio).addProducto(Mockito.any());
    }

}
