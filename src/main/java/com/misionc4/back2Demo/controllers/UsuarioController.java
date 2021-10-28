package com.misionc4.back2Demo.controllers;

import java.util.ArrayList;

import com.misionc4.back2Demo.models.Usuario;
import com.misionc4.back2Demo.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public ArrayList<Usuario> obtenerUsuarios(){
        return usuarioService.getUsuario();
    }

    @PostMapping
    public Usuario guardaUsuario(@RequestBody Usuario usuario){
        return usuarioService.guardaUsuario(usuario);
    }
}
