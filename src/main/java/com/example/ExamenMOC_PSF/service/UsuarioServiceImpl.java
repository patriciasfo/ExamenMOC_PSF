package com.example.ExamenMOC_PSF.service;

import com.example.ExamenMOC_PSF.entity.Usuario;
import com.example.ExamenMOC_PSF.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario addUsuario(Usuario usu) {
        return this.usuarioRepository.save(usu);
    }

    @Override
    public Optional<Usuario> findUsuario(Long id) {
        return this.usuarioRepository.findById(id);
    }
}
