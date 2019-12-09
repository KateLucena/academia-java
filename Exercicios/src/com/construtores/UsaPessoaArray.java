package com.construtores;

public class UsaPessoaArray {
	public static void main(String[] args) {
		
		NovaPessoa pessoas[] = new NovaPessoa[5];
		pessoas[0] = new NovaPessoa();
		
		pessoas[0].nome = "Kate";
		pessoas[0].altura = 1.55;
		pessoas[0].peso = 60;
		pessoas[0].mostrar();
		
		pessoas[1] = new NovaPessoa();
		pessoas[1].nome = "Neide";
		pessoas[1].altura = 1.55;
		pessoas[1].peso = 60;
		pessoas[1].mostrar();
		
		
		pessoas[2] = new NovaPessoa();
		pessoas[2].nome = "Marcia";
		pessoas[2].altura = 1.55;
		pessoas[2].peso = 60;
		pessoas[2].mostrar();
		
		
		pessoas[3] = new NovaPessoa();
		pessoas[3].nome = "Ilson";
		pessoas[3].altura = 1.55;
		pessoas[3].peso = 60;
		pessoas[3].mostrar();
		
		
		pessoas[4] = new NovaPessoa();
		pessoas[4].nome = "Kate";
		pessoas[4].altura = 1.55;
		pessoas[4].peso = 60;
		pessoas[4].mostrar();
		
		
	}
}
