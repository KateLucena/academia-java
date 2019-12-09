package com.arrays;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class exArray4 {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números a serem inseridos: "));
		String arr[] = new String[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = JOptionPane.showInputDialog("Digite o nome inteiro: ");
		}
		Arrays.sort(arr);
		for(int j = 0; j < arr.length; j++) {
			JOptionPane.showMessageDialog(null, "Nome digitado - ordenado: " + arr[j]);
		}
	}
}
