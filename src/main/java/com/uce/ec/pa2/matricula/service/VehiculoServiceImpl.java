package com.uce.ec.pa2.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.uce.ec.pa2.matricula.repository.IVehiculoRepository;
import com.uce.ec.pa2.matricula.repository.modelo.Vehiculo;
@Service
public class VehiculoServiceImpl implements IVehiculoService {
	
	@Autowired
	private IVehiculoRepository vehiculoRepository;
	
	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.seleccionar(placa);
	}

	@Override
	public void ingresar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.insertar(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.actualizar(vehiculo);
	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.eliminar(placa);
	}

	

}
