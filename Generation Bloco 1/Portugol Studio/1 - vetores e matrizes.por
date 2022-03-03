programa
{ 
	//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
     //atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	
	funcao inicio()
	{
		real nota [5]
		inteiro maiorNota = 0, cont 

		para(cont = 0; cont<5; cont++) {
			escreva("Nota: ")
			leia(nota[cont])
			se(nota[cont] > maiorNota)
			maiorNota = nota[cont]
		}
		limpa()
		para(cont = 0; cont<5; cont++) {
			escreva("\nA sua maior nota foi: ", maiorNota)
		}
		
		}
	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 224; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */