package evaluacion2a;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio15_DiccionarioInverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce una palabra");
		String palabra = teclado.nextLine();

		String[] memoria = new String[10];

		boolean stock = false;
		boolean lleno = false;

		int elementos = 0;

		while (!palabra.isEmpty() && !lleno) { // condicion para el bucle
			int posicion = 0;
			stock = false;

			while (posicion < elementos && !stock) { // bucle de los elementos
				if (palabra.compareTo(memoria[posicion]) > 0) {
					stock = true;
				}

				else {
					posicion++;
				}

			}
			for (int posicionMover = elementos; posicionMover > posicion; posicionMover--) {
				memoria[posicionMover] = memoria[posicionMover - 1]; // bucle para ordenar el array
			}

			// guardar la palabra en el array
			memoria[posicion] = palabra;
			elementos++;

			if (elementos >= memoria.length) { // para salir del bucle
				lleno = true;
			}

			else {

				System.out.println("palabras: ");
				palabra = teclado.nextLine();
			}
		}

		teclado.close();

		for (int posicion = 0; posicion < elementos; posicion++) { // sacar en pantalla el array

			System.out.println(memoria[posicion]);
		}

	}

}