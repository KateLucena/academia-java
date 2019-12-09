package com.operadores;

import java.util.Scanner;

public class ExerOperadores {
	public static void main(String[] args) {
		int num1, num2, m;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro numero:");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo numero:");
		num2 = scan.nextInt();
		m = num1 * num2;
		System.out.println("A multiplicação dos números é: " + m);
		scan.close();
		
	}
}
