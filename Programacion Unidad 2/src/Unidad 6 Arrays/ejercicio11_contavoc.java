package evaluacion2a;

import java.util.Scanner;

public class ejercicio11_contavoc {

	public ejercicio11_contavoc() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Vocala = 0, Vocale = 0, Vocali = 0, Vocalo = 0, Vocalu = 0;

		Scanner teclado = new Scanner(System.in);
		
		String cadena = teclado.nextLine().toLowerCase();
		teclado.close();
		
		char[] letras = cadena.toCharArray();
		
		for (int posi = 0; posi < letras.length; posi++) {

			if ((letras[posi]) == 'a') {
				Vocala++;
			}

			else if ((letras[posi]) == 'e') {
				Vocale++;
			}

			else if ((letras[posi]) == 'i') {
				Vocalo++;
			}

			else if ((letras[posi]) == 'o') {
				Vocalo++;
			}

			else if ((letras[posi]) == 'u') {
				Vocalu++;
			}

		}

		System.out.println("cantidad de a = " + Vocala);
		System.out.println("cantidad de e = " + Vocale);
		System.out.println("cantidad de i = " + Vocali);
		System.out.println("cantidad de o = " + Vocalo);
		System.out.println("cantidad de u = " + Vocalu);
	}

}