package com.algoritmo;

import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um n�mero para saber se � par ou �mpar: ");
		int v1 = s.nextInt();
		if(v1 % 2 == 0) {
			System.out.println("O n�mero " + v1 + " � par!");
		}else {
			System.out.println("O n�mero " + v1 + " � �mpar!");
		}
		s.close();
	}
}
