package com.uce.ec.pa2.matricula.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import com.uce.ec.pa2.matricula.repository.IMatriculaRepository;
import com.uce.ec.pa2.matricula.repository.IPropietarioRepository;
import com.uce.ec.pa2.matricula.repository.IVehiculoRepository;
import com.uce.ec.pa2.matricula.repository.modelo.Matricula;
import com.uce.ec.pa2.matricula.repository.modelo.Propietario;
import com.uce.ec.pa2.matricula.repository.modelo.Vehiculo;

public class MatriculaServiceImpl implements IMatriculaService {
	@Autowired
	private IMatriculaRepository matriculaRepository;
	@Autowired
	private IPropietarioRepository propietarioRepository;
	@Autowired
	private IVehiculoRepository vehiculoRepository;

	@Override
	public Matricula buscar(String noMat) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.seleccionar(noMat);
	}

	@Override
	public void ingresar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.insertar(matricula);
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(matricula);
	}

	@Override
	public void borrar(String noMat) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(noMat);
	}

	public void valorMatricula(String placa, String cedula) {

		Vehiculo v2 = this.vehiculoRepository.seleccionar(placa);
		Propietario p2 = this.propietarioRepository.seleccionar(cedula);
		Matricula temp = new Matricula();
		BigDecimal descuento = new BigDecimal(0.05);
		BigDecimal com = new BigDecimal(2000);
		BigDecimal valorFinal;
		if (v2.getTipo().equals("pesado")) {
			BigDecimal valorTemp = v2.getPrecio().multiply(new BigDecimal(0.25));
					}
		if (v2.getTipo().equals("liviano")) {
			BigDecimal valorTemp = v2.getPrecio().multiply(new BigDecimal(0.20));
			
			}

		}
	}

}
