package com.tiposdedados;

public class UsaPessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Carro c1 = new Carro();
		c1.ano = 1999;
		c1.chassi = "JHGDçlç3456";
		c1.placa = "PME3456";
		
		p1.nome = "Kate";
		p1.carro = c1;
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Maria";
		
		p2 = p1;
		
		
		
		
//		p1.idade = 26;
//		p1.sexo = "F";
		
		//System.out.println(c1.placa);
		
	}
}
