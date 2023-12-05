package com.uce.ec.pa2.matricula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.ec.pa2.matricula.repository.IPropietarioRepository;
import com.uce.ec.pa2.matricula.repository.modelo.Propietario;
@Service
public class PropietarioServiceImpl implements IPropietarioService {
	
	@Autowired
	private IPropietarioRepository propietarioRepository;
	
	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.seleccionar(cedula);
	}

	@Override
	public void ingresar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.insertar(propietario);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.actualizar(propietario);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(cedula);
	}

	

}
