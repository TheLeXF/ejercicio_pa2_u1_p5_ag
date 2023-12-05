package com.uce.ec.pa2.matricula.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.uce.ec.pa2.matricula.repository.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	public static List<Vehiculo> base = new ArrayList<Vehiculo>();

	@Override
	public Vehiculo seleccionar(String placa) {
		for (Vehiculo vehiculo : base) {
			if (vehiculo.getPlaca().equals(placa)) {
				Vehiculo v1 = new Vehiculo();
				v1.setMarca(vehiculo.getMarca());
				v1.setPlaca(vehiculo.getPlaca());
				v1.setPrecio(vehiculo.getPrecio());
				v1.setTipo(vehiculo.getTipo());
				return v1;
			}
		}
		// TODO Auto-generated method stub
		return null;
	}

	public Vehiculo seleccionarEliminar(String placa) {
		for (Vehiculo vehiculo : base) {
			if (vehiculo.getPlaca().equals(placa)) {

				return vehiculo;
			}
		}
		return null;

	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		base.add(vehiculo);

	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		this.eliminar(vehiculo.getPlaca());
		this.insertar(vehiculo);

	}

	@Override
	public void eliminar(String placa) {
		Vehiculo v1 = this.seleccionarEliminar(placa);
		base.remove(v1);
	}

}
