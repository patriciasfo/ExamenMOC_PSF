package com.example.ExamenMOC_PSF.repository;

import com.example.ExamenMOC_PSF.entity.Pedido;
import com.example.ExamenMOC_PSF.entity.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface PedidoRepository extends JPARepository<Pedido, Long> {

    List<Pedido> findByUsuario(Usuario user);
}
