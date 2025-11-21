package com.example.ExamenMOC_PSF.controller;

import com.example.ExamenMOC_PSF.entity.Pedido;
import com.example.ExamenMOC_PSF.entity.Usuario;
import com.example.ExamenMOC_PSF.service.PedidoService;
import com.example.ExamenMOC_PSF.service.ProductoService;
import com.example.ExamenMOC_PSF.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PedidoController {

    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private ProductoService productoService;
    @Autowired
    private PedidoService pedidoService;

    @PostMapping(value = "/usuario/pedidos")
    public Pedido addPedido(@RequestBody Pedido pedido) {
        return this.pedidoService.addPedido(pedido);
    }

    @GetMapping(value = "/usuario/{usuId}/pedidos")
    public List<Pedido> buscarPedidos(@PathVariable Long usuId) {
        Optional<Usuario> usu = this.usuarioService.findUsuario(usuId);
        return usu.map(usuario -> this.pedidoService.buscarPedidos(usuario)).orElse(null);
    }
}
