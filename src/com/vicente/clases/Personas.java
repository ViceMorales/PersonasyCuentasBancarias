package com.vicente.clases;

public class Personas {
	public String nombre;
	int edad;
	public String titular = nombre;
	
	public Personas(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.titular = nombre + edad;
	}
	

	public void despliegaInformacion() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
