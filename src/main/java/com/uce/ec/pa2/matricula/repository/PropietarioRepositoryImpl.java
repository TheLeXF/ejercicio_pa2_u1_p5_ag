package com.uce.ec.pa2.matricula.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.ec.pa2.matricula.repository.modelo.Propietario;

@Repository

public class PropietarioRepositoryImpl implements IPropietarioRepository {

	public static List<Propietario> base = new ArrayList<Propietario>();

	@Override
	public Propietario seleccionar(String cedula) {
		for (Propietario propietario : base) {
			if (propietario.getCedula().equals(cedula)) {
				Propietario p1 = new Propietario();
				p1.setApellido(propietario.getApellido());
				p1.setNombre(propietario.getNombre());
				p1.setCedula(propietario.getCedula());
				p1.setGenero(propietario.getGenero());
				return p1;
			}
		}
		return null;
	}

	public Propietario seleccionarEliminar(String cedula) {
		for (Propietario propietario : base) {
			if (propietario.getCedula().equals(cedula)) {

				return propietario;
			}
		}
		return null;

	}

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		base.add(propietario);
	}

	@Override
	public void actualizar(Propietario propietario) {
		this.eliminar(propietario.getCedula());
		this.insertar(propietario);

	}

	@Override
	public void eliminar(String cedula) {
		Propietario p1 = this.seleccionarEliminar(cedula);
		base.remove(p1);

	}

}
