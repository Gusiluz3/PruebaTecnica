package com.usuario.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.usuario.modelo.Tbl_usuario;
import com.usuario.service.IUsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private IUsuarioService service;
	
	@GetMapping("/listar")
	public String listarTbl_usuario(Model model) {
		List<Tbl_usuario> tbl_usuarios = service.listTbl_usuario();
		model.addAttribute("tbl_usuarios", tbl_usuarios);
		return "index";
	}
	
	@GetMapping ("/new")
	public String guardarTbl_usuario(Model model) {
		model.addAttribute("tbl_usuario", new Tbl_usuario());
		return "form";
	}
	
	@PostMapping("/save")
	public String saveTbl_usuario(Tbl_usuario tbl_usuario) {
		service.save(tbl_usuario);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id_usuario}")
	public String editarTbl_usuario(@PathVariable int id_usuario, Model model) {
		Optional<Tbl_usuario> tbl_usuario = service.getTbl_usuarioById(id_usuario);
		model.addAttribute("tbl_usuario",tbl_usuario);
		return "form";
	}
	
	@GetMapping("/eliminar/{id_usuario}")
	public String eliminarTbl_usuario(@PathVariable int id_usuario) {
		service.delete(id_usuario);
		return "redirect:/listar";
	}
	
}
