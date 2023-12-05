package com.uce.ec.pa2.matricula.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.ec.pa2.matricula.repository.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {
	public static List<Matricula> base = new ArrayList<Matricula>();

	@Override
	public Matricula seleccionar(String noMat) {
		for (Matricula matricula : base) {
			if (matricula.getNoMatricula().equals(noMat)) {
				Matricula m1 = new Matricula();
				m1.setFechaMatricula(matricula.getFechaMatricula());
				m1.setNoMatricula(matricula.getNoMatricula());
				m1.setPropietario(matricula.getPropietario());
				m1.setValorMatricula(matricula.getValorMatricula());
				m1.setVehiculo(matricula.getVehiculo());
				return m1;
			}
		}
		return null;
	}

	public Matricula seleccionarEliminar(String noMat) {
		for (Matricula matricula : base) {
			if (matricula.getNoMatricula().equals(noMat)) {

				return matricula;
			}
		}
		return null;

	}

	@Override
	public void insertar(Matricula matricula) {
		base.add(matricula);

	}

	@Override
	public void actualizar(Matricula matricula) {
		this.eliminar(matricula.getNoMatricula());
		this.insertar(matricula);

	}

	@Override
	public void eliminar(String noMat) {
		Matricula m1 = this.seleccionar(noMat);
		base.remove(m1);
	}

}
