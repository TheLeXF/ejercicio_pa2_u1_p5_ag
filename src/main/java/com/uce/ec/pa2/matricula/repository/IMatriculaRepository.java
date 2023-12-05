package com.uce.ec.pa2.matricula.repository;

import com.uce.ec.pa2.matricula.repository.modelo.Matricula;

public interface IMatriculaRepository {
	public Matricula seleccionar (String noMat);
	public void insertar (Matricula matricula);
	public void actualizar (Matricula matricula);
	public void eliminar (String noMat);
	
}
