programa
{
	
	funcao inicio()
	{

		cadeia nome

		escreva("digite o nome ")
		leia(nome)
		linha(50)
		pula()
		escreva(nome)
		pula()
		linha(60)
		escreva("\nFIM DO PROGRAMA")
		
	}
	
	//fora do programa principal
	
	funcao linha(inteiro tamanho){
				
		para ( inteiro y = 0;y<=tamanho;y++){
			escreva("-")
		}
	}

	funcao pula(){
		escreva("\n")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 151; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */