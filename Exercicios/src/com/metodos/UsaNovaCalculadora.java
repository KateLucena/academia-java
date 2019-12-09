package com.metodos;

import javax.swing.JOptionPane;

public class UsaNovaCalculadora {
	public static void main(String[] args) {
		NovaCalculadora cal = new NovaCalculadora();
		int res1 = cal.calcularsub(10, 7);
		int res2 = cal.calcularsub1(10, 2);
		int res3 = cal.calcularsub2(10, 1);
		
		JOptionPane.showMessageDialog(null, " Subtração 1: " + res1 + "\n Subtração 2: " + res2 + "\n Subtração 3: " + res3);
//		JOptionPane.showMessageDialog(null, "Subtração 2: " + res2);
//		JOptionPane.showMessageDialog(null, "Subtração 3: " + res3);
		
	}
}
