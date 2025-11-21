package com.example.ExamenMOC_PSF.controller;

import com.example.ExamenMOC_PSF.entity.Usuario;
import com.example.ExamenMOC_PSF.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(value = "/usuarios")
    public Usuario addUsuario(@RequestBody Usuario usu) {
        return this.usuarioService.addUsuario(usu);
    }

}
