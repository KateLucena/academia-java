package com.algoritmo;

import java.util.Scanner;

public class CalcMedia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double n1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double n2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		double n3 = sc.nextDouble();
		double m = (n1+n2+n3)/3;
		
		System.out.println("A média das notas é: " + m);
		sc.close();
	}
}
