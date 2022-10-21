package com.usuario.modelo;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table (name = "TBL_USUARIO")
public class Tbl_usuario {
	
	@Id
	@Column(name = "id_usuario")
	@GeneratedValue
	private Integer id_usuario;
	
	@Column(name = "usuario")
	private String usuario;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "apellido_paterno")
	private String apellido_paterno;
	
	@Column(name = "apellido_materno")
	private String apellido_materno;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "fecha_creacion")
	private Date fecha_creacion;
	
	@Column(name = "estatus")
	private Integer estatus;
	
	@Column(name = "curp")
	private String curp;
	
	@Column(name = "rfc")
	private String rfc;
	
	@ManyToMany
	@JoinTable (name = "tbl_role_usuario", joinColumns = @JoinColumn (name ="id_usuario"),
	inverseJoinColumns = @JoinColumn(name = "id_role"))
	private Set<Tbl_role> roles = new HashSet<>();
	
	public Tbl_usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Tbl_usuario(Integer id_usuario, String usuario, String password, String apellido_paterno,
			String apellido_materno, String nombre, String email, Date fecha_creacion, Integer estatus, String curp,
			String rfc, Set<Tbl_role> roles) {
		super();
		this.id_usuario = id_usuario;
		this.usuario = usuario;
		this.password = password;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.nombre = nombre;
		this.email = email;
		this.fecha_creacion = fecha_creacion;
		this.estatus = estatus;
		this.curp = curp;
		this.rfc = rfc;
		this.roles = roles;
	}

	public Tbl_usuario(String usuario, String password, String apellido_paterno, String apellido_materno, String nombre,
			String email, Date fecha_creacion, Integer estatus, String curp, String rfc, Set<Tbl_role> roles) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.nombre = nombre;
		this.email = email;
		this.fecha_creacion = fecha_creacion;
		this.estatus = estatus;
		this.curp = curp;
		this.rfc = rfc;
		this.roles = roles;
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public Set<Tbl_role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Tbl_role> roles) {
		this.roles = roles;
	}
	
}
