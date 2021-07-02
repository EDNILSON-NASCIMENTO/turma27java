programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * Escreve um programa que lê duas matrizes N1 (4,6) 
		 * e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos serão as somas
		dos elementos de mesma posição das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças
		dos elementos de mesma posição das matrizes N1 e N2.
		 */
		inteiro N1[4][4]
		inteiro N2[4][4]
		inteiro M1[4][4]
		inteiro M2[4][4]

		inteiro diagonal=0
						
		para(inteiro linha=0;linha<4; linha++){
			para(inteiro coluna=0;coluna<4; coluna++){
				/*
				escreva("digite o valor de ",linha," - ",coluna," N1:")
				leia(N1[linha][coluna])
				escreva("digite o valor de ",linha," - ",coluna," N2:")
				leia(N2[linha][coluna])
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna]
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna]
				*/
				N1[linha][coluna] = Util.sorteia(3,4)
				N2[linha][coluna] = Util.sorteia(0,2)
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna]
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna]
				
			}
		}
		escreva("MATRIZ N1\n")
		para(inteiro linha=0;linha<4; linha++){
			para(inteiro coluna=0;coluna<4; coluna++){
				escreva(N1[linha][coluna]," ")
				/*
				se (linha==coluna){
					diagonal = diagonal + N1[linha][coluna]
				}
				*/
				
			}
			escreva("\n")
			diagonal += N1[linha][linha] //tecnica refencial substitu o se
		}
		escreva("somatorio da diagonal principal é :",diagonal,"\n")

		escreva("MATRIZ N2\n")
		para(inteiro linha=0;linha<4; linha++){
			para(inteiro coluna=0;coluna<4; coluna++){
				escreva(N2[linha][coluna]," ")
			}
			escreva("\n")
		}
		escreva("MATRIZ M1\n")
		para(inteiro linha=0;linha<4; linha++){
			para(inteiro coluna=0;coluna<4; coluna++){
				escreva(M1[linha][coluna]," ")
			}
			escreva("\n")
		}
		escreva("MATRIZ M2\n")
		para(inteiro linha=0;linha<4; linha++){
			para(inteiro coluna=0;coluna<4; coluna++){
				escreva(M2[linha][coluna]," ")
			}
			escreva("\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1424; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 15, 10, 2}-{N2, 16, 10, 2}-{M1, 17, 10, 2}-{M2, 18, 10, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */