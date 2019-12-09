package com.arrays;

import javax.swing.JOptionPane;

public class ExArray1 {
	public static void main(String[] args) {
		int arr[] = new int[2];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
		}
		for(int j = 0; j < arr.length; j++) {
			JOptionPane.showMessageDialog(null, arr[j]);
		}

	}
	
}
