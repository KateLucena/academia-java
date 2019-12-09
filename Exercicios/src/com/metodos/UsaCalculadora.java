package com.metodos;

import javax.swing.JOptionPane;

public class UsaCalculadora {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int resp1 = calc.calcular(5, 2);
		int resp2 = calc.calcular(5, 2, 3);
		int resp3 = calc.calcular(5, 2, 4, 6);
		int resp4 = calc.calcular(5, 2, 3, 5, 6);
		int resp5 = calc.calcular(5, 2, 3, 5, 6,9,11,22);
		int resp6 = calc.calcularsub(10, 2);
		int resp7 = calc.calcularmult(10, 2);
		int resp8 = calc.calculardiv(10, 2);
		
		
//		System.out.println(resp1);
//		System.out.println(resp2);
//		System.out.println(resp3);
//		System.out.println(resp4);
		JOptionPane.showMessageDialog(null, " Resultado 1:  " + resp1 + "\n Resultado 2: " + resp2 + 
				"\n Resultado 3: " + resp3 + "\n Resultado 4: " + resp4 + "\n Resultado 5: " + resp5 + "\n Resultado 6: " + resp6 + "\n Resultado 7: " + resp7 + "\n Resultado 8: " + resp8);
		
	}
}
