programa
{
	// para
	/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.*/
     
     inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro contador, contagemPessoas = 0, contf, percentual = 0, filhos = 0
		real salario = 0.0, maiorSalario = 0.0, somatotalsalario = 0.0, somatotalfilhos = 0.0, somatotalmaiorSalario = 0.0, menor_salario = 0.0

		para(contador = 1; contador <= 3; contador++) { 
			escreva("salario: ")
			leia(salario)
			escreva("filhos: ")
			leia(filhos)
			
		somatotalsalario = somatotalsalario + salario
		somatotalfilhos = somatotalfilhos + filhos
		//somatotalmaiorSalario = somatotalmaiorSalario + salario

		percentual = (contagemPessoas * 100/contador)

			se ( salario > somatotalmaiorSalario){
				somatotalmaiorSalario+=1
				}
			senao{}

			se (salario <=100){
				menor_salario+=1
				}
			
			
		
		}
		
		
		contf = contador -1
		escreva("a média dos salarios é igual a:\n " + somatotalsalario/contador)
		escreva("a média dos filhos é igual a:\n " + somatotalfilhos/contador)
		escreva("a média do maiorSalario é igual a: \n" + somatotalmaiorSalario/contador)
		escreva("a média do percentual é iual a:\n ", menor_salario * 100 /contador)
		escreva(contador)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 314; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */