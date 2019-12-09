package com.construtores;

//import javax.swing.JOptionPane;

public class Cap8_Lab2 {
	public static void main(String[] args) {
		
		if(args.length > 0) {
			int soma = 0;
			int media = 0;
			
			for(String num : args) {
				soma += Integer.parseInt(num);
				media = soma / args.length;
			}
			System.out.println("A média das idades é: ");
			int idade;
			for(String num : args) {
				idade = Integer.parseInt(num);
				System.out.println(idade);
				//JOptionPane.showMessageDialog(null, idade);
			}
			//JOptionPane.showMessageDialog(null, "A média do seu array é: " + media);
			System.out.println("É : " + media);
		}else {
			System.out.println("Entre com valores válidos!");
		}
		
	}
}
