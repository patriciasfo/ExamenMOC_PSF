package com.example.ExamenMOC_PSF.repository;

import com.example.ExamenMOC_PSF.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JPARepository<Usuario, Long> {

    List<Usuario> findAll();
    Usuario findByApellidos(String apellidos);
}
