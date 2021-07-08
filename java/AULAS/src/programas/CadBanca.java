package programas;

import java.util.Scanner;

import objetos.Conta;
import objetos.FrontLoko;
import objetos.Pessoa;

public class CadBanca {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Pessoa cliente1 = new Pessoa();
		FrontLoko desenho = new FrontLoko();
		Conta clibanca = new Conta(55,100);
		
		
				
		System.out.println("Digite seu nome: ");
		cliente1.nome = leia.next();
		System.out.println("Digite o ano de nascimento :");
		cliente1.anoNascimento = leia.nextInt();
		linha(80);
		if (cliente1.calcularIdade(2021)>=18) {
			System.out.println("Pode comprar tudo!!!");
		} else {
			System.out.println("Proibido conteudo menor de 18 anos!!!");
		}
		System.out.println("DADOS BANCARIOS ");
		clibanca.imprimeExtrato();
		System.out.println("Valor da revista :");
		double valor = leia.nextDouble();
		System.out.println("Processando pagamento");
		clibanca.saca(valor);
		System.out.println("SITUAÇÃO ATUAL DA CONTA APÓS PAGAMENTO");
		clibanca.imprimeExtrato();
		
	}
	
	public static void linha(int tamanho) {
		for (int x=1; x<=tamanho; x++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
