package com.uce.ec.pa2.matricula.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;
@Component
public class Matricula {
	private String noMatricula;
	private LocalDateTime fechaMatricula;
	private Propietario propietario;
	private Vehiculo vehiculo;
	private BigDecimal valorMatricula;
	
	public String getNoMatricula() {
		return noMatricula;
	}
	public void setNoMatricula(String noMatricula) {
		this.noMatricula = noMatricula;
	}
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	@Override
	public String toString() {
		return "Matricula [noMatricula=" + noMatricula + ", fechaMatricula=" + fechaMatricula + ", propietario="
				+ propietario + ", vehiculo=" + vehiculo + "]";
	}
	
}
