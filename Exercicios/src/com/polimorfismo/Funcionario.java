package com.polimorfismo;

public class Funcionario {
	//atributos
	protected String nome;
	protected String email;
	int idade;
	char sexo;
	
	//construtores
	public Funcionario(String nome, String email, int idade, char sexo) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.sexo = sexo;
	}
	public Funcionario() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
}
