package com.algoritmo;

import java.util.Scanner;

public class IfComposto {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int v1 = s.nextInt();
		if(v1 > 20) {
			System.out.println("O número digitado," + v1 + ", é maior que 20!");
		}else {
			System.out.println("O número digitado," + v1 + ", é menor que 20!");
		}
		s.close();
	}
}
