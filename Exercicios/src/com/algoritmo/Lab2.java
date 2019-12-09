package com.algoritmo;

import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um número para saber se é par ou ímpar: ");
		int v1 = s.nextInt();
		if(v1 % 2 == 0) {
			System.out.println("O número " + v1 + " é par!");
		}else {
			System.out.println("O número " + v1 + " é ímpar!");
		}
		s.close();
	}
}
