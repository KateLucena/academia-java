package com.construtores;

public class Cadastro {
	//atributos privados
	private String nome;
	private String sobrenome;
	private int idade;
	
	
	// getter e setter
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	//construtor padrão
	public Cadastro() {
		super();
	}
	//construtor com parametros
	
	public Cadastro(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	public Cadastro(String nome, String sobrenome, int idade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}
	//método
	public void mostrar() {
		System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade);
	}
	
	
	
}
