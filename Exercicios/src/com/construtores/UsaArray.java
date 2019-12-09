package com.construtores;

public class UsaArray {
	public static void main(String[] args) {
		int numeros[] = new int[5];
		numeros[0] = 30;
		numeros[1] = 211;
		numeros[2] = 490;
		numeros[3] = 40;
		numeros[4] = 100;
		
	
		int resp = Cap8_Array.maiorNumero(numeros);
		
		System.out.println("o maior número é: " + resp);
	}
}
