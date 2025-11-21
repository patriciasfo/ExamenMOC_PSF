package com.example.ExamenMOC_PSF.repository;

import com.example.ExamenMOC_PSF.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByApellidos(String apellidos);
}
