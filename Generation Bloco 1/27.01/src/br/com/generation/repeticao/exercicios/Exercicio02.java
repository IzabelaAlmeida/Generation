package br.com.generation.repeticao.exercicios;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		int numero = 10;
		int i;
		int soma;
		
		for(i=0, soma = 0; i<= numero; ++i) {
			System.out.println("Soma: " + soma + " + " + i);
			soma = soma + i;
			System.out.println(" = " + soma);
			
		}
				
	}

	
}
