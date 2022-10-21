package com.usuario.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.usuario.modelo.Tbl_usuario;

@Repository
public interface UsuarioDao extends CrudRepository<Tbl_usuario, Serializable>{
	
}
