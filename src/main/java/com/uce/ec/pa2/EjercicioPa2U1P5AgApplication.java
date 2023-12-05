package com.uce.ec.pa2;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.ec.pa2.matricula.repository.modelo.Propietario;
import com.uce.ec.pa2.matricula.repository.modelo.Vehiculo;

import com.uce.ec.pa2.matricula.service.IPropietarioService;
import com.uce.ec.pa2.matricula.service.IVehiculoService;

@SpringBootApplication
public class EjercicioPa2U1P5AgApplication implements CommandLineRunner{
	
	@Autowired
	private IVehiculoService vehiculoService;
	@Autowired
	private IPropietarioService propietarioService;

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPa2U1P5AgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Vehiculo v =new Vehiculo();
		v.setMarca("Chevrolet");
		v.setPlaca("PCB1232");
		v.setPrecio(new BigDecimal(14999.99));
		v.setTipo("liviano");
		
		this.vehiculoService.ingresar(v);
		System.out.println("Vehiculo Chevrolet:"+this.vehiculoService.buscar(v.getPlaca()));
		
		Propietario p = new Propietario();
		p.setApellido("Guanoluisa");
		p.setNombre("Alexis");
		p.setCedula("1727450296");
		p.setGenero("Masculino");
		this.propietarioService.ingresar(p);
		System.out.println("Propeitario: "+this.propietarioService.buscar(p.getCedula()));
		
		p.setApellido("Fernandez");
		p.setGenero("Femenino");
		this.propietarioService.actualizar(p);
		System.out.println("Propitario actualizado: "+this.propietarioService.buscar(p.getCedula()));
		
		
	}

}
