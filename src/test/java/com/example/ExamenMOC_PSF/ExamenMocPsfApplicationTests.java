package com.example.ExamenMOC_PSF;

import com.example.ExamenMOC_PSF.controller.ProductoController;
import com.example.ExamenMOC_PSF.entity.Producto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ExamenMocPsfApplicationTests {

    @Autowired
    private ProductoController productoController;

	@Test
	void contextLoads() {
	}

    @Test
    void testGetProducto(){
        Optional<Producto> producto = this.productoController.getProducto(1L);
        assertTrue(producto.isEmpty());
    }

}
