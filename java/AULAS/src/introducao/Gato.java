package introducao;

public class Gato extends Pet{
	
	private boolean miadoAlto;

	public Gato(String porte, boolean pelagemAlta, String raca, boolean miadoAlto) {
		super(porte, pelagemAlta, raca);
		this.miadoAlto = miadoAlto;
	}

	public boolean isMiadoAlto() {
		return miadoAlto;
	}

	public void setMiadoAlto(boolean miadoAlto) {
		this.miadoAlto = miadoAlto;
	}
	
	
	@Override
	public void emiteSom() {
		System.out.println("miau miau miau...");
	}
	
}
