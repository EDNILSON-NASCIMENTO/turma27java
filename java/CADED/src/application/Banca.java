package application;

import entities.Revista;
import entities.Salgadinho;

public class Banca {

	public static void main(String[] args) {
		
	
		
		Revista prod1 = new Revista("001","ABRIL");
		Salgadinho prod2 = new Salgadinho("002","FOFURA");
		
		prod1.setNome("CRAUDIA");
		prod1.colocarEstoque(10);
		
		System.out.println(prod1.getEstoque());
		
		
		prod1.tirarEstoque(5);
		
		System.out.println(prod1.getNome());
		System.out.println(prod1.getEstoque());
		
		System.out.println(prod2.getNome());
		System.out.println(prod2.getEstoque());
		
		
		
		
		

	}

}
