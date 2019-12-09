package com.polimorfismo;

public class Programador extends Funcionario {
	//atributos
	private String linguagem;
	private String sistemaOperacional;
	
	//construtores
	public Programador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Programador(String nome, String email, int idade, char sexo, String linguagem, String sistemaOperacional) {
		super(nome, email, idade, sexo);
		this.linguagem = linguagem;
		this.sistemaOperacional = sistemaOperacional;
	}
//	public Programador(String nome, String email, int idade, char sexo) {
//		super(nome, email, idade, sexo);
//	}
	public String getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	public String getSistemaOperacional() {
		return sistemaOperacional;
	}
	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + super.getNome());
		System.out.println("Email: " + super.getEmail());
		System.out.println("Linguagem: " + linguagem);
		System.out.println("Sistema Operacional: " + sistemaOperacional);
	}
	
	
}
