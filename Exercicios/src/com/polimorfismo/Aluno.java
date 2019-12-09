package com.polimorfismo;

public class Aluno extends Pessoa{
	private float mensalidade;
	private String curso;
	
	
	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Aluno(float mensalidade, String curso, String nome, int idade, char sexo, int numeroRG, String dataNasc) {
		super();
		super.idade = idade;
		super.nome = nome;
		super.sexo = sexo;
		super.rg = new RG(numeroRG, dataNasc);
		this.mensalidade = mensalidade;
		this.curso = curso;
	}
	public Aluno() {
		super();
	}
	@Override
	public String falar() {
		// TODO Auto-generated method stub
		
		return null;
	}
	@Override
	public String mostrarDados() {
		System.out.println("Nome: " + super.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("RG: " + this.getRg());
		System.out.println("RG: " + this.mensalidade);
		System.out.println("RG: " + this.curso);
		
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
