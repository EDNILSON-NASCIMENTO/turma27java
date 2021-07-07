package programas;

import objetos.Cachorro;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro duke = new Cachorro();
		
		duke.latidoAlto = true;
		duke.pelo = "CARAMELO";
		duke.porte = 'M';
		duke.raca = "VIRA-LATA";
		duke.idade = 0;
			
		duke.latir();
		System.out.println("10 ANOS DEPOIS...");
		duke.idade = 10;
		
		System.out.println("10 ANOS DEPOIS...");
		duke.idade = 20;

		duke.jesusTeChama();
		
	}

}
