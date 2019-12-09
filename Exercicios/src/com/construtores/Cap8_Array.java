package com.construtores;

public class Cap8_Array {
	static int maiorNumero(int arr[]) {
		
		int max = 0;
		for(int num: arr) {
			if(num > max) {
				max = num;
			}
		}
		return max; 
	}
	

}
