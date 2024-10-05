package com.vicente;

import com.vicente.clases.Personas;

import java.util.ArrayList;
import com.vicente.clases.CuentaBancaria;


public class Aplicacion {
	
	public static void main (String[] args) {
		
		Personas vicente = new Personas("Vicente Morales", 22);
		Personas amari = new Personas("Amari Flores", 23);
		Personas loki = new Personas("Loki Pipeño", 6);
		
		CuentaBancaria cuentaVicente = new CuentaBancaria(2000.0, vicente);
		CuentaBancaria cuentaAmari = new CuentaBancaria(4000.0, amari);
		CuentaBancaria cuentaLoki = new CuentaBancaria(2500.0, loki);
		
		CuentaBancaria.agregarCuenta(cuentaVicente);
		CuentaBancaria.agregarCuenta(cuentaAmari);
		CuentaBancaria.agregarCuenta(cuentaLoki);
		
		cuentaVicente.depositar(300.0);
		cuentaAmari.retirar(700.0);
		
		cuentaVicente.despliegaInformacion();
		cuentaAmari.despliegaInformacion();
		cuentaLoki.despliegaInformacion();
		
		CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
			  
	}
	

}
// estas imprimiendo un objeto, imprime el get