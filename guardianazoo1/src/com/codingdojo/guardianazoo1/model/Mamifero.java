package com.codingdojo.guardianazoo1.model;

public class Mamifero {
	private int nivelDeEnergia;
	
	public Mamifero() {
		setNivelDeEnergia(100);
	}

	public int mostrarEnergia() {
		System.out.println("Energía actual: " + nivelDeEnergia);
		return nivelDeEnergia;
	}

	public void setNivelDeEnergia(int nivelDeEnergia) {
		this.nivelDeEnergia = nivelDeEnergia;
	}
}
