package com.operadores;

import java.util.Scanner;

public class ExercOperadores2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o nome do funcionario: ");
		String func = s.nextLine();
		
		System.out.println("Digite o valor das vendas do mês: ");
		double vendas = s.nextDouble();
		
		double porcentVendas = vendas * 0.08;
		
		System.out.println( func + " , a porcentagem de suas vendas do mês é: " + porcentVendas);
		s.close();
		
	}
}
