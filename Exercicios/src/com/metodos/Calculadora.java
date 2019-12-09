package com.metodos;

public class Calculadora {
	
//	public int calcular(int a, int b) {
//		return a + b;
//	}
//	public int calcular(int a, int b, int c) {
//		return a + b + c;
//	}
//	public int calcular(int a, int b, int c, int d) {
//		return a + b + c + d;
//	}
//	public int calcular(int a, int b, int c, int d, int e) {
//		return a + b + c + d + e;
//	}
	public int calcularsub(int a, int b) {
		return a - b;
	}
	public int calcularmult(int a, int b) {
		return a * b;
	}
	public int calculardiv(int a, int b) {
		return a / b;
	}
	public int calcular(int...lista) {
		int soma = 0;
		for(int item : lista) {
			soma += item;
		}
		return soma;
	}
	
}
	
