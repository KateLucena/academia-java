package com.arrays;

import javax.swing.JOptionPane;

public class ExArray2 {
	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas a ser inseridas: "));
		int arr[] = new int[n];
		int soma = 0;
		int media = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do aluno: "));
			soma += arr[i];
		}
		
		media = soma / arr.length;
		
		
		if (media >= 7) {
			JOptionPane.showMessageDialog(null, "Aluno passou de ano! M�dia: " + media);
		} else if (media >= 4){
			JOptionPane.showMessageDialog(null, "Deve refazer a prova! M�dia: " + media);
		}else {
			JOptionPane.showMessageDialog(null, "Aluno reprovado! nota: M�dia: " + media);
		}
	}
}
