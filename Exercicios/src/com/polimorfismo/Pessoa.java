package com.polimorfismo;

public abstract class Pessoa {
	String nome;
	int idade;
	char sexo;
	RG rg;
	
	
	
	public Pessoa() {
		super();
	}
	public Pessoa(String nome, int idade, char sexo, RG rg) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public RG getRg() {
		return rg;
	}
	public void setRg(RG rg) {
		this.rg = rg;
	}
	
	public abstract String falar();
		
	public abstract String mostrarDados();
}
