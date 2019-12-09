package com.construtores;

public class UsaConstrutorCadastro {
	public static void main(String[] args) {
		
		
		Cadastro cad = new Cadastro();
		//atribuindo valores em atributos privados
		cad.setNome("Kate");
		cad.setSobrenome("Lucena");
		cad.setIdade(25);
		cad.mostrar();
		
		cad.setNome("João");
		cad.setSobrenome("Pereira");
		cad.setIdade(30);
		
		cad.mostrar();
	}
}
