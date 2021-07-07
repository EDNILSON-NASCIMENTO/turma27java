package programas;

import java.util.Scanner;

import objetos.Pessoa;

public class CadFriends {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); //instanciou um scanner /teclado
		Pessoa amigo1 = new Pessoa();
		Pessoa amigo2 = new Pessoa();
		
		int idadeteste;
		
		System.out.println("Digite o nome");
		amigo1.nome = leia.next();
		System.out.print("Digite o sexo M/F/O:");
		amigo1.sexo =leia.next().charAt(0);
		System.out.print("Digite o ano de nascimento :");
		amigo1.anoNascimento = leia.nextInt();
		
		linha(50);
		
		System.out.println("amigo 2");
		System.out.println("Digite o nome");
		amigo2.nome = leia.next();
		amigo2.anoNascimento = 2000;
		idadeteste = amigo2.calcularIdade(2030);
		System.out.println(amigo1.nome+" sua idade é "+amigo1.calcularIdade());
		System.out.println(amigo2.nome+" sua idade é "+idadeteste);
		
	
	}
	
	public static void linha(int tamanho) {
		for (int x=1; x<=tamanho; x++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
