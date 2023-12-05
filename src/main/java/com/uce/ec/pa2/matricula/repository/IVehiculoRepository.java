package com.uce.ec.pa2.matricula.repository;

import com.uce.ec.pa2.matricula.repository.modelo.Vehiculo;

public interface IVehiculoRepository {
	
	public Vehiculo seleccionar (String placa);
	public void insertar (Vehiculo vehiculo);
	public void actualizar (Vehiculo vehiculo);
	public void eliminar (String placa);
	
}
