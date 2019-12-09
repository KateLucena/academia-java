package com.construtores;

public class NovaPessoa {
	double altura;
	double peso;
	String nome;
	
	public NovaPessoa(double altura, double peso, String nome) {
		super();
		this.altura = altura;
		this.peso = peso;
		this.nome = nome;
	}

	public NovaPessoa() {
		super();
	}
	
	public void mostrar() {
		System.out.println("Nome: " + nome + " Peso: " + peso + " Altura: " + altura);
	}
	
}
