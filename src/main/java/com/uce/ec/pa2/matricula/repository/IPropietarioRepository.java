package com.uce.ec.pa2.matricula.repository;

import com.uce.ec.pa2.matricula.repository.modelo.Propietario;


public interface IPropietarioRepository {
	
	public Propietario seleccionar (String cedula);
	public void insertar (Propietario propietario);
	public void actualizar (Propietario propietario);
	public void eliminar (String cedula);
}
