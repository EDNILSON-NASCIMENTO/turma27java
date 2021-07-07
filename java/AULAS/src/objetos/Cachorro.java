package objetos;

public class Cachorro {
	
	public String raca;
	public String pelo;
	public boolean latidoAlto;
	public char porte; //P-pequeno, G-Grande, M-medio
	public int idade;
	
	
	public void latir() {
		System.out.println("AU AU AU...");
	}
	
	public void jesusTeChama() {
		
		if (idade>10) {
			System.out.println("JESUS TE CHAMAR....");
		} else {
			System.out.println("PODE FICA DE BOA...");
		}
		
	}
	
	
}
