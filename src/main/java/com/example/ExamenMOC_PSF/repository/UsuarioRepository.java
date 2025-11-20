package com.example.ExamenMOC_PSF.repository;

import com.example.ExamenMOC_PSF.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    List<Usuario> findAll();
    Usuario findByApellidos(String apellidos);
}
