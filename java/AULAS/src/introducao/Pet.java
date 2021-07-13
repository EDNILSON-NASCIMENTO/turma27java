package introducao;

public abstract class Pet {
	
	private String porte;
	private boolean pelagemAlta;
	private String raca;
	
	
	public Pet(String porte, boolean pelagemAlta, String raca) {
		super();
		this.porte = porte;
		this.pelagemAlta = pelagemAlta;
		this.raca = raca;
	}


	public String getPorte() {
		return porte;
	}


	public void setPorte(String porte) {
		this.porte = porte;
	}


	public boolean isPelagemAlta() {
		return pelagemAlta;
	}


	public void setPelagemAlta(boolean pelagemAlta) {
		this.pelagemAlta = pelagemAlta;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void emiteSom() {
		System.out.println("Emitindo som...");
	}
	
	
}
