package com.algoritmo;

import java.util.Scanner;

public class IfComposto {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int v1 = s.nextInt();
		if(v1 > 20) {
			System.out.println("O n�mero digitado," + v1 + ", � maior que 20!");
		}else {
			System.out.println("O n�mero digitado," + v1 + ", � menor que 20!");
		}
		s.close();
	}
}
