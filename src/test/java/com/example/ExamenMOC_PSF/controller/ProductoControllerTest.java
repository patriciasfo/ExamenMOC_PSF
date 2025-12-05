package com.example.ExamenMOC_PSF.controller;

import com.example.ExamenMOC_PSF.entity.Producto;
import com.example.ExamenMOC_PSF.repository.ProductoRepository;
import com.example.ExamenMOC_PSF.service.ProductoService;
import com.example.ExamenMOC_PSF.service.ProductoServiceImpl;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductoControllerTest {

    @InjectMocks
    private ProductoController productoController;

    //@Mock
    //ProductoRepository productoRepository;
    @Mock
    ProductoServiceImpl servicio;

    @Test
    public void testAddProducto()
    {
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        Producto esperado = new Producto(1L, "prod1", "desc", "cat1", 2.4f, null, "observaciones", 3);
//        when(productoRepository.save(any(Producto.class))).thenReturn(esperado);
        when(servicio.addProducto(any(Producto.class))).thenReturn(esperado);

        Producto respuesta = this.productoController.addProducto(new Producto(1L, "prod1", "desc", "cat1", 2.4f, null, "observaciones", 3));
        Assertions.assertEquals(respuesta, esperado);
    }

}
