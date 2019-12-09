package com.tiposdedados;

public class Pessoa {
	
		String nome;
		int idade;
		String sexo;
		Carro carro;
		
		
		public Pessoa() {
			super();
		}


		public Pessoa(int idade, String nome, Carro carro){
			super();
			this.idade = idade;
			this.nome = nome;
			this.carro = carro;
		}
		
	
}
