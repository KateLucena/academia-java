package com.estruturadecontrole;

import java.util.Scanner;

public class ExercicioCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite um n�mero:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num > 20) {
			System.out.println("O n�mero � maior que 20: " + num);
		} else {
			System.out.println("O n�mero � menor que 20: " + num);
		} 
//		if() {
//			System.out.println("Digite apenas n�meros");
//		}
		sc.close();
	}

}
