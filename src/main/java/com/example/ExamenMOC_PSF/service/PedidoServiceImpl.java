package com.example.ExamenMOC_PSF.service;

import com.example.ExamenMOC_PSF.entity.Pedido;
import com.example.ExamenMOC_PSF.entity.Usuario;
import com.example.ExamenMOC_PSF.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public Pedido addPedido(Pedido pedido) {
        return this.pedidoRepository.save(pedido);
    }

    @Override
    public List<Pedido> buscarPedidos(Usuario usu) {
        return this.pedidoRepository.findByUsuario(usu);
    }
}
