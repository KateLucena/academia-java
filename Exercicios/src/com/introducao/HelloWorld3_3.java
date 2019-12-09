package com.introducao;

public class HelloWorld3_3 {
	public static void main(String[] args) {
		int num1, num2, num3,soma;
		
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		num3 = Integer.parseInt(args[2]);
		
		soma = num1 + num2 + num3;
		
	
		System.out.println("A soma dos parametros é: " + soma);
	}
}
