package com.operadores;

import java.util.Scanner;

public class ExercOperadores3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o valor da cota��o do d�lar: ");
		double cot = s.nextDouble();
		System.out.println("Digite um valor em d�lar: ");
		double dol = s.nextDouble();
		double calc = dol * cot;
		
		System.out.println("O valor apresentado em d�lar, representa R$ " + calc + " reais");
		s.close();
		
	}
}
