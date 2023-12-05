package com.uce.ec.pa2.matricula.service;

import com.uce.ec.pa2.matricula.repository.modelo.Matricula;

public interface IMatriculaService {
	
	public Matricula buscar (String noMat);
	public void ingresar (Matricula matricula);
	public void actualizar (Matricula matricula);
	public void borrar (String noMat);
	
}
