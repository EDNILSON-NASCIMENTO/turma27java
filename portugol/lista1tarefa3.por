programa
{
	
	funcao inicio()
	{
		//PROGRAMA : NOME - OBJETIVO
		//INICIO
			//VARIAVEIS
			//ENTRADAS
			//PROCESSAMENTOS
			//SAIDAS			
		//FIM
		/* OBJETIVO
		 * Faça um sistema que leia o tempo de duração de um evento em uma 
		 * fábrica expressa em segundos e mostre-o expresso em horas, minutos 
		 * e segundos
		 * segundos
		 * minuto = 1 minuto = 60 segundos
		 * hora = 60 minutos = 3600 segundos
		 */
		 inteiro tempoEvento
		 inteiro horas, minutos, segundos

		 //entradas
		 escreva("Digite os segundos do evento[segundos]: ")
		 leia(tempoEvento)
		 //processamento
		 horas = tempoEvento / 3600
		 minutos= (tempoEvento % 3600) / 60
		 segundos = (tempoEvento % 3600) % 60
			
		 //saidas
		 escreva("Horas : "+horas+"\n")
		 escreva("Minutos : "+minutos+"\n")
		 escreva("Segundos :"+segundos+"\n\n")
		 
		 escreva("FIM DE PROGRAMA")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 685; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */