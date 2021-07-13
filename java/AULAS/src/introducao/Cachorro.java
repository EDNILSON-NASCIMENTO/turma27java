package introducao;

public class Cachorro  extends Pet{
	
	private boolean latidoAlto;

	public Cachorro(String porte, boolean pelagemAlta, String raca, boolean latidoAlto) {
		super(porte, pelagemAlta, raca);
		this.latidoAlto = latidoAlto;
	}

	public boolean isLatidoAlto() {
		return latidoAlto;
	}

	public void setLatidoAlto(boolean latidoAlto) {
		this.latidoAlto = latidoAlto;
	}
	
	@Override
	public void emiteSom() {
		System.out.println("au au au au...");
	}
	
	
}
