package com.usuario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usuario.dao.UsuarioDao;
import com.usuario.modelo.Tbl_usuario;

@Service
public class ServiceImplement implements IUsuarioService {
	
	@Autowired
	private UsuarioDao dao;
	
	@Override
	public List<Tbl_usuario> listTbl_usuario() {
		return (List<Tbl_usuario>) dao.findAll();
	}

	@Override
	public Optional<Tbl_usuario> getTbl_usuarioById(int id_usuario) {
		return dao.findById(id_usuario);
	}

	@Override
	public int save(Tbl_usuario tbl_usuario) {
		int result = 0;
		Tbl_usuario u = dao.save(tbl_usuario);
		if (!u.equals(null)) {
			result = 1;
		}
		return result;
	}

	@Override
	public void delete(int id_usuario) {
		dao.deleteById(id_usuario);
	}

}
