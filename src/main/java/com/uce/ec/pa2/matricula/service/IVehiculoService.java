package com.uce.ec.pa2.matricula.service;

import com.uce.ec.pa2.matricula.repository.modelo.Vehiculo;

public interface IVehiculoService {
	
	public Vehiculo buscar (String placa);
	public void ingresar (Vehiculo vehiculo);
	public void actualizar (Vehiculo vehiculo);
	public void borrar (String placa);
	
}
