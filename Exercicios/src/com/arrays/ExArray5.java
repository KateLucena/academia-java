package com.arrays;
import javax.swing.JOptionPane;

public class ExArray5 {
	public static void main(String[] args) {
		int arr[] = new int[2];
		int arr1[] = new int[2];
		
		for(int i = 0; i < arr.length; i++) {
			arr1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o nome inteiro: ")) * 2;
		}
		for(int j = 0; j < arr1.length; j++) {
			JOptionPane.showMessageDialog(null, "O dobro do número digitado é: "+ arr1[j]);
		}
	}
}
