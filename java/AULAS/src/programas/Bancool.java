package programas;

import java.util.Scanner;

import objetos.Conta;

public class Bancool {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		Conta cliente1 = new Conta(1000);  //instanciar
		Conta clientevip = new Conta(1000,55.55);
		Conta clienteEspecial = new Conta(3);
		Conta cliJaque = new Conta(45,1955.45,2000.00);
		//System.out.println("numero da conta "+clienteEspecial.getNumero());
		System.out.println("numero da conta "+cliente1.getNumero()+" e esta conta é "+cliente1.contaVeiaOuNova(cliente1.getNumero()));
		//System.out.println("numero da conta "+clienteEspecial.getNumero());
		
		/*
		cliJaque.imprimeExtrato();
		clientevip.imprimeExtrato();
		clienteEspecial.imprimeExtrato();
		
		cliJaque.saca(1000.33);
		cliJaque.imprimeExtrato();
		clienteEspecial.deposita(5000.55);
		clienteEspecial.imprimeExtrato();
		*/
		
		cliente1.deposita(100);
		cliente1.imprimeExtrato();
		cliente1.saca(0);
		cliente1.imprimeExtrato();
		
	}

}
