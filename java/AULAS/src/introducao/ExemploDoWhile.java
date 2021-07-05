package introducao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		
		/*
		 * 2- Faça um programa que pegue um número do teclado e calcule 
		 * a soma de todos os números  de 1 até ele.
		   Ex.: o usuário entra 7, o programa vai mostrar 28,
		 *  pois  1+2+3+4+5+6+7=28.
		 */
		
		Scanner leia = new Scanner(System.in);
		int numero=0;
		int x=1;
		int aux=1;
		
		System.out.println("Digite um numero positivo: ");
		numero = leia.nextInt();
		
		if (numero<=0) {
			System.out.println("Numero invalido!!!");
		} 
		else if (numero==1) {
			System.out.println("1 = 1");
		}
		else {
			do {
				// 1+2+3+4+5+6+7
				// aux+=(aux+x)
				System.out.printf("%d + ",x);
				x++;
				aux=aux+x;
			} while(x<numero);
			System.out.print(x);
			System.out.print(" = "+aux);
		}
	}
}
