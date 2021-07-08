package objetos;

public class Conta {
		
		//atributos
		private int numero;
		private double saldo;
		private double limite;
		
		
		//CONSTRUTOR 
		public Conta(int numero) {
			this.numero = numero;
		}
		//construtor - sobrecargas
		public Conta(int numero, double saldo) {
			this.numero = numero;
			this.saldo = saldo;
		}
		public Conta(int numero, double saldo, double limite) {
			super();
			this.numero = numero;
			this.saldo = saldo;
			this.limite = limite;
		}
		
		//ENCAPSULAMENTO - GETTERS AND SETTERS

		public int getNumero() {
			return numero;
		}
		
		public void setNumero(int numero) {
			this.numero = numero;
		}
		

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public double getLimite() {
			return limite;
		}

		public void setLimite(double limite) {
			this.limite = limite;
		}
				
		
		
		//METODOS PROPRIOS
		/*
		 - saca() : void
		 - deposita() : void
		 - imprimeExtrato(): void
		*/
		
		public void imprimeExtrato() {
			System.out.println("Conta numero "+numero+" saldo atual : R$ "+saldo);
		}
		
		public void saca(double valorSaque) {
			if (valorSaque<=0) {
				System.out.println("Valor informado invalido...");
			}
			else if (valorSaque> saldo) {
				System.out.println("Saldo indisponivel...");
			} else {
				saldo = saldo - valorSaque;
				System.out.println("Saque realizado!");
			}
			
		}
		
		public void deposita(double valorDeposito) {
			saldo = saldo + valorDeposito;
		}
		
		//entre 1 e 100 velhas, acima são novas - VELHA OU NOVA
		public String contaVeiaOuNova(int numeroConta) {
			String resposta;
			if (numeroConta>100) {
				resposta = "NOVA";
			} else {
				resposta = "VELHA";
			}
				
			return resposta;
		}
		
		
		
}
