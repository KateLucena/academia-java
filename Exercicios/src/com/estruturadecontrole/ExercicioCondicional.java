package com.estruturadecontrole;

import java.util.Scanner;

public class ExercicioCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite um número:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num > 20) {
			System.out.println("O número é maior que 20: " + num);
		} else {
			System.out.println("O número é menor que 20: " + num);
		} 
//		if() {
//			System.out.println("Digite apenas números");
//		}
		sc.close();
	}

}
