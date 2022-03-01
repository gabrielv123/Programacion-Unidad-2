package evaluacion2a;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio12_ArrayOrdenado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int posicion;

		int[] num = new int[10];

		int contador = 0;

		boolean encontrado, lleno;

		int elementos = 0;

		encontrado = false;
		lleno = false;

		Scanner teclado = new Scanner(System.in);

		System.out.println("escribe un numero");
		int numero = teclado.nextInt();

		while (numero >= 0 && !lleno) {

			posicion = 0;
			while (posicion < elementos && !encontrado) {

				if (num[posicion] > numero) {
					encontrado = true;
				}

				else {
					posicion++;
				}

			}

			for (int posicionmover = elementos; posicionmover > posicion; posicionmover--) {
				num[posicionmover]--;
			}
				num[posicion] = numero;
				elementos++;

				if (elementos >= 5) {
					lleno = true;				}

				else {
					System.out.println("n: ");
					numero = teclado.nextInt();
				}
		}
			teclado.close();

			for (posicion = 0; posicion < elementos; posicion++) {
				System.out.println(num[posicion]);
			}
		

	}

}
