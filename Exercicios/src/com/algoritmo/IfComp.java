package com.algoritmo;

import java.util.Scanner;

public class IfComp {
	public static void main(String[] args) {
		double bonus;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o seu salário: ");
		double v1 = s.nextDouble();
		s.close();
		System.out.println("Digite o seu tempo de empresa: ");
		double v2 = s.nextDouble();
		if(v2 >= 5) {
			bonus = v1 * 0.20;
		}else {
			bonus = v1 * 0.10;
		}
		System.out.println("O seu bonus é de : " + bonus);
			
		}
		
	
	
	}

