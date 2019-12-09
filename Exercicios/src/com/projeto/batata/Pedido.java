package com.projeto.batata;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	long numero;
	ArrayList<String> produtos = new ArrayList();
	double total;
	Cliente cliente;
	Endereco endereco;
	boolean retirada;
	Date data;
	String observacao;
	tipoDePagamento tipoDepagamento;
	status status;
	
	
}
