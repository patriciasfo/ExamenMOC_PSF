package com.example.ExamenMOC_PSF.service;

import com.example.ExamenMOC_PSF.entity.Pedido;
import com.example.ExamenMOC_PSF.entity.Usuario;

import java.util.List;

public interface PedidoService {
    Pedido addPedido(Pedido pedido);
    List<Pedido> buscarPedidos(Long usu);
}
