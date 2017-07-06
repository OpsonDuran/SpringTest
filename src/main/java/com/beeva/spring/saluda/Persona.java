package com.beeva.spring.saluda;

public class Persona {
	private String nombre;
	
	public Persona(String nombre){
		this.nombre = nombre;
		System.out.println("Persona:"+this.nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		nombre = nombre;
	}

}
