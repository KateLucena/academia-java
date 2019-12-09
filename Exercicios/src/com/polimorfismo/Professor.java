package com.polimorfismo;

public class Professor extends Pessoa {
	private float salario;
	private String disciplina;
	public float getSalario() {
		return salario;
	}
	
	
	public Professor(float salario, String disciplina, String nome, int idade, char sexo, int numeroRG, String dataNasc) {
		super();
		super.idade = idade;
		super.nome = nome;
		super.sexo = sexo;
		super.rg = new RG(numeroRG, dataNasc);
		this.salario = salario;
		this.disciplina = disciplina;
	}
	


	public Professor() {
		super();
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}


	@Override
	public String falar() {
		// TODO Auto-generated method stub
		System.out.println("Olá" + this.getNome());
		return null;
	}


	@Override
	public String mostrarDados() {
		// TODO Auto-generated method stub
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("RG: " + this.rg);
		return null;
	}
	
	
	
	
}
