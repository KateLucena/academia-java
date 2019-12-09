package com.metodos;

import javax.swing.JOptionPane;



public class UsaCombustivel {
	public static void main(String[] args) {
		
		
		double et = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em reais do litro de etanol:"));
		double gas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em reais do litro de gasolina:"));
	
		MelhorCombustivel calc = new MelhorCombustivel();
		double res = calc.divisao(et, gas);
		
		if(res < 0.7) {
			JOptionPane.showMessageDialog(null, "Abasteça com Etanol!");
			
		}else {
			JOptionPane.showMessageDialog(null, "Abasteça com Etanol!");
		
		}
		
	}
}
