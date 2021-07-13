package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceiro;

public class TesteCad {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		List <Funcionario> lista = new ArrayList<>(); //lista do tipo funcionario
		int numero;
		
		System.out.println("CADASTRO DE FUNCIONARIOS");
		System.out.println();
		System.out.print("Digite a quantidade de funcionarios a ser cadastrada :");
		numero = leia.nextInt();
		
		for (int x=1; x<=numero; x++) {
			
			System.out.println("Funcionario : "+x);
			System.out.print("Funcionario terceiro S/N :?");
			char op = leia.next().toUpperCase().charAt(0);
			System.out.print("Digite a matricula do funcionario :");
			String matricula = leia.next();
			System.out.print("Digite as horas trabalhadas :");
			int horasTrabalhadas = leia.nextInt();
			System.out.print("Digite o valor por hora trabalhada : R$ ");
			double valorHora = leia.nextDouble();
			
			if (op == 'S') {
				System.out.print("Digite o valor do adicional : R$ ");
				double adicional = leia.nextDouble();
				lista.add(new Terceiro(matricula,horasTrabalhadas,valorHora,adicional ));
				
			} else if (op=='N'){
				
				lista.add(new Funcionario(matricula,horasTrabalhadas,valorHora));
				
			} else {
				System.out.println("VC NÃO DIGITOU SE ERRA TERCEIRO OU NÃO, PERDEU PLAYBOY/GIRL/MATE");
			}
						
		}
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO");
		
		for (Funcionario pessoa : lista) {
			System.out.println("Matricula do colaborador : "+pessoa.getMatricula()+" salario R$ : "+pessoa.salario());
		}
		

	}

}
