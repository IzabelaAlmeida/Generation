package br.com.generation.vetores;

import java.util.Scanner;

public class Exerc02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor [] = new int [5];
		int maior = 0;
		
		for(int i = 0; i < valor.length; i++) {
			System.out.println("Digite o valor: " +(i+1) + "º valor: " );
			valor[i] = sc.nextInt();
			if(valor[i] > maior) 
			    maior = valor[i];
			
			} 
		    
		    System.out.println("Maior valor = " + maior);
	}
}
		
		
		
		
		
	


