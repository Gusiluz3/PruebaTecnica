package com.usuario.service;

import java.util.List;
import java.util.Optional;

import com.usuario.modelo.Tbl_usuario;

public interface IUsuarioService {
	
	public List<Tbl_usuario> listTbl_usuario();
	public Optional<Tbl_usuario> getTbl_usuarioById(int id_usuario);
	public int save (Tbl_usuario tbl_usuario);
	public void delete (int id_usuario);
}
