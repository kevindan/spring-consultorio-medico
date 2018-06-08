package com.spring.consultorio.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Rol implements Serializable {

	private Long idRol;
	private List<Usuario> usuarios;
	private String descripcion;
	private Date fechaRegistro;
	private int eliminado;

	private static final long serialVersionUID = 1L;

}
