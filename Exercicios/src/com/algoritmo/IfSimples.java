package com.algoritmo;

import java.util.Scanner;

public class IfSimples {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um n�mero para saber se � par ou �mpar: ");
		int v1 = s.nextInt();
		if(v1 % 2 == 1) {
			System.out.println("O n�mero " + v1 + " � �mpar!");
		}else {
			System.out.println("O n�mero " + v1 + " � par!");
		}
		s.close();
	}
}
