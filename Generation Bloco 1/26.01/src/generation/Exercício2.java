package generation;

import java.util.Scanner;

public class Exercício2 {
	public static void main(String [] args) {
		
		int dias, meses , anos;
		int idadeEmDias, idadeEmMeses = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a idade em anos: ");
		anos = leitor.nextInt();
		   
		System.out.println("Digite a idade em meses: ");
		meses = leitor.nextInt();
		   
		System.out.println("Digite a idade em dias " );
		dias = leitor.nextInt();
		
        idadeEmDias = anos * 365 + meses * 30 + dias;
        idadeEmMeses = (anos * 12) + meses;
        
        		
		System.out.println("Valor da idade em dias: " + idadeEmDias);
		
		System.out.println("Valor da idade em meses:" + idadeEmMeses);
		
		System.out.println("Valor da idade em anos:" + anos);
		

		
	}
	

}
