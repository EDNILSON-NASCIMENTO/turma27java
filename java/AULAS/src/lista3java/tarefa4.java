package lista3java;

import java.util.Scanner;

public class tarefa4 {

	public static void main(String[] args) {
		/*
		 *Uma empresa desenvolveu uma pesquisa para saber as características psicológicas 
		 *dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado:
		 * idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
		 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
		 *  Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas,
		 *  calcule e mostre: (WHILE)
		o número de pessoas calmas; 
		o número de mulheres nervosas; 
		o número de homens agressivos; 
		o número de outros calmos;
		o número de pessoas nervosas com mais de 40 anos; 
		o número de pessoas calmas com menos de 18 anos.
		 */
		Scanner leia = new Scanner(System.in);
		
		int idade=0;
		char sexo; //(1-feminino / 2-masculino / 3-Outros)
		char opcao; // (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva)
		int pessoasCalmas=0;
		int mulheresNervosas=0;
		int homensAgressivos=0;
		int outrosCalmos=0; 
		int pessoasNervosasMais40Anos=0;
		int pessoasCalmasMenos18Anos=0;
		char op='S';
		final int LIMITE = 150;
		int contador=1;
		String nome;
		
		while ( op=='S' && contador <= LIMITE) {
			System.out.println("Participante "+contador);
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			System.out.println("Digite");
			System.out.print("1-feminino\n2-masculino\n3-Outros : ");
			sexo = leia.next().charAt(0);
			System.out.println("Selecione ");
			System.out.print("1 - pessoa calma\n2 - pessoa nervosa\n3 - pessoa agressiva : ");
			opcao = leia.next().charAt(0);
			
			if (opcao =='1') {
				pessoasCalmas++;
			}
			
			if (sexo=='1' && opcao =='2') {
				mulheresNervosas++;
			}
			
			if (sexo=='2' && opcao =='3') {
				homensAgressivos++;
			}
			
			if (sexo =='3' && opcao =='1') {
				outrosCalmos++;
			}
			
			if(idade>40 && opcao=='2') {
				pessoasNervosasMais40Anos++;
			}
			
			if (idade<18 && opcao=='1') {
				pessoasCalmasMenos18Anos++;
			}
			
			System.out.println("Continua S/N:");
			op = leia.next().toUpperCase().charAt(0);
			//saida do loop
			contador++;
			
		}
		System.out.println("Pessoas calmas : "+pessoasCalmas);
		System.out.println("Mulheres nervorsas : "+mulheresNervosas);
		System.out.println("Homens agressivos : "+homensAgressivos);
		System.out.println("Outros calmos : "+outrosCalmos);
		System.out.println("Pessoas nervosas mais de 40 anos :"+pessoasNervosasMais40Anos);
		System.out.println("Menos de 18 calmos :"+pessoasCalmasMenos18Anos);

		
	}

}
