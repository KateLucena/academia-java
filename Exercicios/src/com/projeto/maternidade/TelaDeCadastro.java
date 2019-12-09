package com.projeto.maternidade;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class TelaDeCadastro {
	public static void main(String[] args) {
		ArrayList<RegistroDeNascimento> registroDeNascimento = new ArrayList<>();
		int contador=0;
		RegistroDeNascimento reg = new RegistroDeNascimento();
		
		for(int i = 0; i < 2; i++) {
			reg.setNome(JOptionPane.showInputDialog("Digite o nome da criança: "));
			reg.setNomeMae(JOptionPane.showInputDialog("Digite o nome da mãe da criança: "));
			reg.setSexo(JOptionPane.showInputDialog("Digite o sexo da criança: "));
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de gestação: "));
			
			if(num < 9) {
				reg.setMesesGestacao(num);
				if(num < 8) {
					reg.setUti(true);
					contador++;
				}
				
			}
			
			registroDeNascimento.add(reg);
		}
		
		for(int j = 0; j < 2; j++) {
			System.out.println("Nome: " + registroDeNascimento.get(j).getNome() + 
			" Nome da Mãe: " + registroDeNascimento.get(j).getNomeMae() + 
			" Sexo: " + registroDeNascimento.get(j).getSexo());
		}
	
			System.out.println("Crianças que irão para a UTI: " + contador);
		}
		
		
		//System.out.println(registroDeNascimento.get(0).getNome());
		
		
		
//		for(int i = 0; i < 5; i++) {
//			String receb = 
//			registroDeNascimento[receb];
//		}
	
}
