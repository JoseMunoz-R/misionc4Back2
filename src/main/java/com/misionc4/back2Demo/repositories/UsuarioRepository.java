package com.misionc4.back2Demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.misionc4.back2Demo.models.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
