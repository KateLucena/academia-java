package com.desafio;


public class Elevador1 {
	public static void main(String args[]) {
        Pilha p = new Pilha();
        int num = 0;
        for(int i=0; i < 11; i++) {
        	p.push(num = i);
        	System.out.println(num);
        }
   
//        while (p.isEmpty() == false) {
//        	p.pop(num);
//        	System.out.println(num);
//        }
	}
}
        
		
		
		
	
	
