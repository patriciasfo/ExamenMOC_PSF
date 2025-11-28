package com.example.ExamenMOC_PSF.service;

import com.example.ExamenMOC_PSF.entity.Usuario;

import java.util.Optional;

public interface UsuarioService {

    Usuario addUsuario(Usuario usu);
    Optional<Usuario> findUsuario(Long id);
}
