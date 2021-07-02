package introducao;

import java.util.Scanner;

public class TesteBank {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero=1;
		double saldo=0.00;
		char op;
		char continua;
		char cd=' ';
		double valor=0.00;
		
		do {
		
		System.out.println("BANCO CPI - ACREDITE SE QUISER");
		System.out.println();
		System.out.println("1 - Conta Internacional");
		System.out.println("2 - Conta Startup");
		System.out.println("3 - SAIR");
		System.out.print("Digite o numero da sua opção: ");
		op = leia.next().charAt(0);
			
			if (op == '1') {
				System.out.println("Rodou conta internacional");
				
			    for (int x=1; x<=10; x++) {
			    	System.out.println("Saldo atual R$ "+saldo);
			    	System.out.print("Digite o valor :");
			    	valor = leia.nextDouble();
			    	System.out.println("Débito ou Credito: ");
			    	cd = leia.next().charAt(0);
			    	if (cd=='d') {
			    		saldo = saldo - valor;
			    	}
			    	else {
			    		saldo = saldo + valor;
			    	}
			    	System.out.println("Continua S/N? ");
					continua = leia.next().toUpperCase() .charAt(0);
					if (continua =='N') {
						break;
					}
			    }
			    
			    
				
			}
			else if (op=='2') {
				System.out.println("conta startup .....");
				System.out.println("Continua S/N? ");
				continua = leia.next().toUpperCase() .charAt(0);
				
			}
			else if(op=='3') {
				System.out.println("saindo....");
				
			}
			else {
				System.out.println("vc digitou uma tecla errada....");
				
			}
		} while (op!='3');
		
	

	}
	
	public static void contaInt() {
		System.out.println("conta internacional.....");
	}

}
