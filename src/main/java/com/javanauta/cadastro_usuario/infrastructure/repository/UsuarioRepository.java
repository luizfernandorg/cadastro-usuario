package com.javanauta.cadastro_usuario.infrastructure.repository;

import com.javanauta.cadastro_usuario.infrastructure.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
