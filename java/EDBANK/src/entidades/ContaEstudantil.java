package entidades;

public class ContaEstudantil extends Conta {

	private double limiteEstudantil;

	public ContaEstudantil(int numero, String nomeCliente, double limiteEstudantil) {
		super(numero, nomeCliente);
		this.limiteEstudantil = limiteEstudantil;
	}

	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	
	public void usarLimiteEstudantil(double valor) {
		
		this.limiteEstudantil = this.limiteEstudantil - valor;
		super.credito(valor);
		
	}
	
}
