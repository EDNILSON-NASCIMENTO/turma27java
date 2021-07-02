programa
{
	
	funcao inicio()
	{
		cadeia predioJess[3][3] //linhas/colunas
		inteiro linha, coluna

		predioJess[0][0] = "CAIO L."
		predioJess[0][1] = "VIC"
		predioJess[0][2] = "AUGUSTO"
		predioJess[1][0] = "TAI"
		predioJess[1][1] = "VALMIR"
		predioJess[1][2] = "NATALIA"
		predioJess[2][0] = "JOAO"
		predioJess[2][1] = "FABIO"
		predioJess[2][2] = "JANAINA"

		para (inteiro x=0; x<3; x++){
			para (inteiro y=0; y<3; y++){
				escreva(predioJess[x][y],"\t")
			}
			escreva("\n")
		}

		
		escreva("Digite a linha:")
		leia(linha)
		escreva("Digite a coluna :")
		leia(coluna)
		escreva("o morador do apto ",linha," - ",coluna," é ",predioJess[linha][coluna])

		
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 270; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {predioJess, 6, 9, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */