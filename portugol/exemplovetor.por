programa
{
	
	funcao inicio()
	{

		cadeia carretaFuracao[] = {"HOMEM-ARANHA","PANTERA NEGRA", "MULHER-MARAVILHA", "HUKLYN","DOLLYNHO"}
		inteiro numPersonagem
		/*
		escreva("0 - ")
		escreva(carretaFuracao[0])
		escreva("\n1 - ")
		escreva(carretaFuracao[1])
		escreva("\n2 - ")
		escreva(carretaFuracao[2])
		escreva("\n3 - ")
		escreva(carretaFuracao[3])
		escreva("\n4 - ")
		escreva(carretaFuracao[4])
		escreva("\n")
		*/
		para (inteiro x=0; x<5; x++){
			escreva(x+" - "+carretaFuracao[x]+"\n")
		}

		escreva("Digite o numero do personagem de 0 a 4 :")
		leia(numPersonagem)
				
		escreva(carretaFuracao[numPersonagem])
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 592; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */