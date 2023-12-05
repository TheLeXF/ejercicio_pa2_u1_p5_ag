package com.uce.ec.pa2.matricula.service;

import com.uce.ec.pa2.matricula.repository.modelo.Propietario;

public interface IPropietarioService {
	
	public Propietario buscar (String cedula);
	public void ingresar (Propietario propietario);
	public void actualizar (Propietario propietario);
	public void borrar (String cedula);
	
}
