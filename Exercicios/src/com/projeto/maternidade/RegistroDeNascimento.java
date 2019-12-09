package com.projeto.maternidade;

public class RegistroDeNascimento {
	private String nome;
	private String nomeMae;
	private String sexo;
	private int mesesGestacao;
	private boolean uti;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getMesesGestacao() {
		return mesesGestacao;
	}
	public void setMesesGestacao(int mesesGestacao) {
		this.mesesGestacao = mesesGestacao;
	}
	public boolean isUti() {
		return uti;
	}
	public boolean getUti() {
		return uti;
	}
	public void setUti(boolean uti) {
		this.uti = uti;
	}
	public RegistroDeNascimento() {
		super();
		mesesGestacao=9;
		uti = false; 
	}

	
	
}
