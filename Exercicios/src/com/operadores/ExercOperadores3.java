package com.operadores;

import java.util.Scanner;

public class ExercOperadores3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o valor da cotação do dólar: ");
		double cot = s.nextDouble();
		System.out.println("Digite um valor em dólar: ");
		double dol = s.nextDouble();
		double calc = dol * cot;
		
		System.out.println("O valor apresentado em dólar, representa R$ " + calc + " reais");
		s.close();
		
	}
}
