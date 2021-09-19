package br.com.project.impl;

import br.com.project.interfaces.Incrementador;

public class IncrementadorImpl implements Incrementador{
	
	@Override
	public int incrementa(int valor) {
		
		System.out.println("Acessando a implementacao.");
		valor++;
		return valor;
		
	}

}

