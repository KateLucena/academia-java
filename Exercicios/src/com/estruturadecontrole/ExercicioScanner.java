package com.estruturadecontrole;

import java.util.Scanner;

public class ExercicioScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o seu nome");
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.nextLine();
		System.out.println(nome);
		scanner.close();

	}

}
