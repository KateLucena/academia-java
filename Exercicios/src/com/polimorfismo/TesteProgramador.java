package com.polimorfismo;

public class TesteProgramador {
	public static void main(String[] args) {
		Programador junior = new Programador();
		junior.nome = "Kate";
		junior.email = "kl@santos";
		junior.setLinguagem("JAVA");
		junior.setSistemaOperacional("Windows");
		junior.imprimirDados();
	}
}
