package com.usuario.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_ROLE")
public class Tbl_role {
	
	@Id
	@Column(name = "ID_ROLE")
	@GeneratedValue
	public Integer id_role;
	
	@Column(name = "ROLE")
	public String role;
	
	public Tbl_role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Tbl_role(Integer id_role, String role) {
		super();
		this.id_role = id_role;
		this.role = role;
	}
	
	public Tbl_role(String role) {
		super();
		this.role = role;
	}
	
	@Override
	public String toString() {
		return role;
	}
	
	public Integer getId_role() {
		return id_role;
	}
	
	public void setId_role(Integer id_role) {
		this.id_role = id_role;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
}
