package com.carro;

public class Garagem {
	Carro carroPasseio = new Carro();
	Carro carroUtilitario = new Carro();
	
	public static void main(String[] args) {
		Garagem g = new Garagem();
		
		g.carroPasseio.cor = "Azul";
		g.carroPasseio.modelo = "Clio";
		g.carroPasseio.potenciadomotor = "1000";
		
		g.carroUtilitario.cor = "Verde";
		g.carroUtilitario.modelo = "Van";
		g.carroUtilitario.potenciadomotor = "2000";
		
		
		
		System.out.println("Carro de Passeio: " + g.carroPasseio.toString());
		System.out.println("--------------------------------");
		System.out.println("Carro Utilitário: " + g.carroUtilitario.toString());

	}
	
}

