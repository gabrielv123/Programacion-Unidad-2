package evaluacion2a;

import java.util.Scanner;

public class ejercicio10_caracmay {

	public ejercicio10_caracmay() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		int posicion;
		int elementos;
		char caracter;
		char mayor;
		int i =0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("nombre :");
		nombre = teclado.nextLine();

		teclado.close();

		elementos = nombre.length();
		mayor = 0;
		posicion = 0;

		while (posicion < elementos) {
			caracter = nombre.charAt(posicion);
			if (caracter > mayor) {
				mayor = caracter;
				i = posicion;
			}
			
			posicion++;
		}

		System.out.println("mayor :" + mayor);
		System.out.println("posicion :" + i);
	}

}
