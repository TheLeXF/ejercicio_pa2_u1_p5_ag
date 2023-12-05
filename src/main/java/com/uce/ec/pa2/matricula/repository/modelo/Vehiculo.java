package com.uce.ec.pa2.matricula.repository.modelo;

import java.math.BigDecimal;
import org.springframework.stereotype.Component;

@Component
public class Vehiculo {
	private String placa;
	private String marca;
	private String tipo;
	private BigDecimal precio;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Vehiculo [placa=" + placa + ", marca=" + marca + ", tipo=" + tipo + ", precio=" + precio + "]";
	}

}
