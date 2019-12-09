package com.operadores;

import java.util.Scanner;

public class ExerOperadores1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite o primeiro numero: ");
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		System.out.println("Digite o segundo numero: ");
		int num2 = s.nextInt();
		System.out.println("Digite o segundo numero: ");
		int num3 = s.nextInt();
		
		num1 = num1 * num1;
		num2 = num2 * num2;
		num3 = num3 * num3;
		
		double soma = num1 + num2 + num3;
		s.close();
		System.out.println("A soma de calculo de cada quadrado é: " + soma);
		
	}

}
