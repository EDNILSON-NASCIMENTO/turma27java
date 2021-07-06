package introducao;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String agenda[][] = new String[24][31];
		int horaaux=0, diaaux=0;
		System.out.println("Digite o dia do evento :");
		diaaux = leia.nextInt()-1;
		System.out.println("Digite a hora :");
		horaaux = leia.nextInt();
		System.out.println("digite o evento :");
		agenda[horaaux][diaaux] = leia.next().toUpperCase();
		
		for (int hora=0; hora<24; hora++) {
			for (int dia=0; dia<31; dia++) {
				if (agenda[hora][dia] != null)
				System.out.println("Agenda dia "+(dia+1)+" hora :"+hora+" : "+agenda[hora][dia]);
			}
		}
		
	}

}
