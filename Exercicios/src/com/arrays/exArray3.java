package com.arrays;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class exArray3 {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números a serem inseridas: "));
		int arr[] = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número inteiro: "));
		}
		Arrays.sort(arr);
		for(int j = 0; j < arr.length; j++) {
			JOptionPane.showMessageDialog(null, "Numero digitado: " + arr[j]);
		}
	}
}
