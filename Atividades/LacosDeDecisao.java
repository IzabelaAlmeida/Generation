package generation;

import java.util.Scanner;

public class LacosDeDecisao {

	public static void main(String[] args) {
		
		int idade=0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		
		idade = leitor.nextInt();
		if(idade >= 9 && idade <= 26) {
			
			if(idade >= 10 && idade <= 14) {
				System.out.println("Categoria Infantil");
				
			}
			
			if(idade >= 15 && idade <=17) {
				System.out.println("Categoria Juvenil");
				
			}
			
			if (idade >= 18 && idade <= 25) {
				System.out.println("Categoria Adulto") ;
			}
			
		}
		else {System.out.println("Idade não categorizada");}
			

	}}


