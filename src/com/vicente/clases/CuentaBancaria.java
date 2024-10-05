package com.vicente.clases;

import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
	double saldo;
	Personas titular;
	int numeroCuenta;
	static ArrayList<CuentaBancaria> numCuentas = new ArrayList<CuentaBancaria>();

	public CuentaBancaria(double saldo, Personas titular) {
		this.saldo = saldo;
		this.titular = titular;
		Random random = new Random();
		this.numeroCuenta = random.nextInt(999999);
		numCuentas = new ArrayList<CuentaBancaria>();
	}


	public static void agregarCuenta(CuentaBancaria cuenta){
		numCuentas.add(cuenta);
			  
	}
	
	public static void imprimeInformacionDeTodasLasCuentas() {
		System.out.println("-----Impresion de todas las cuentas------");
		for(CuentaBancaria cuenta : numCuentas) {
			cuenta.despliegaInformacion();}
		System.out.println("------------------");
		
	}
	
	public void despliegaInformacion() {
		System.out.println("----Informacion de la cuenta----");
		System.out.println("Nombre del titular: " + titular.nombre);
		System.out.println("Edad: " + titular.edad);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Numero de cuenta: " + this.numeroCuenta);
	}
	public void depositar(double monto) {
		this.saldo += monto;
		System.out.println("Tu saldo ahora es de: " + this.saldo);
	}
	public void retirar(double monto) {
		this.saldo -= monto;
		System.out.println("Tu saldo ahora es de: " + this.saldo);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Personas getTitular() {
		return titular;
	}

	public void setTitular(Personas titular) {
		this.titular = titular;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
}

