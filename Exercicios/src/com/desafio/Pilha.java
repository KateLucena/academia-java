package com.desafio;

public class Pilha {
	public Object[] vetor;
	public int ponteiro;
	
	
	public Pilha() {
		this.ponteiro = -1;
		this.vetor = new Object[10];
	}
	
	public boolean isEmpty(){
		if(this.ponteiro == -1) {
			return true;
		}
		return false;
	}
	public int size() {
		if(this.isEmpty()) {
			return 0;
		}
		return this.ponteiro + 1;
	}
	public Object top() {
		if(this.isEmpty()) {
			return null;
		}
		return this.vetor[this.ponteiro];
	}
	
	public Object pop() {
		if(this.isEmpty()) {
			return null;
		}
		return this.vetor[this.ponteiro --];
	}
	
	public void push(Object valor) {
		if(this.ponteiro < this.vetor.length-1) {
			this.vetor[++ponteiro] = valor;
		}
	}

	
	
}
