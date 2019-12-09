package com.algoritmo;

import java.util.Scanner;

public class AnoNasc {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o ano de seu nascimento: ");
		int anoNasc = s.nextInt();
		System.out.println("Digite o ano atual: ");
		int anoAtual = s.nextInt();
		
		int idade = anoAtual - anoNasc;
		System.out.println("A sua idade é: " + idade + " anos");
		s.close();
	}
}
