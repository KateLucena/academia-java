package com.cap5lab1;

public class Cap5_Lab1 {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome ="Neide";
		f1.sobrenome = "Pereira";
		f1.cargo = "Professora";
		f1.salario = 4000;
		
		System.out.println("Nome: " + f1.nome);
		System.out.println("Sobrenome: " + f1.sobrenome);
		System.out.println("Cargo: " + f1.cargo);
		System.out.println("Salário: " + f1.salario);
	}
}
