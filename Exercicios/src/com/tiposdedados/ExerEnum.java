package com.tiposdedados;

public class ExerEnum {
	public enum DiaDaSemana{
		Domingo,Segunda,Terca,Quarta,Quinta,Sexta,Sabado;
	}
	public static void main(String[] args) {
		DiaDaSemana diabom = DiaDaSemana.Sexta;
		System.out.println("Dia bom é: " + diabom.name());
	}
}
