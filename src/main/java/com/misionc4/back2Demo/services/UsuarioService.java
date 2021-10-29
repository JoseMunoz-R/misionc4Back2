package com.misionc4.back2Demo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.misionc4.back2Demo.models.Usuario;
import com.misionc4.back2Demo.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<Usuario> getUsuario(){
        return (ArrayList<Usuario>) usuarioRepository.findAll();
    }

    public Usuario guardaUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> obtenerById(Long id){
        return usuarioRepository.findById(id);
    }

    public boolean eliminarUsuarioById(Long id){
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
