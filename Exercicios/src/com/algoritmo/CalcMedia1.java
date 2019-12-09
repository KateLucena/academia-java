package com.algoritmo;

import java.util.Scanner;

public class CalcMedia1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite uma nota: ");
		double n1 = s.nextDouble();
		System.out.println("Digite outra nota: ");
		double n2 = s.nextDouble();
		
		double media = (n1+n2)/2;
		s.close();
		System.out.println("A média é: " + media);
	}
	
	
	
}
