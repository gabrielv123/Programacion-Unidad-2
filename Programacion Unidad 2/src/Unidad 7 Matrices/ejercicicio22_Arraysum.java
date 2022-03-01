package evaluacion2;

import java.util.Scanner;

public class ejercicicio22_Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int filas, columna;
		int datos = 0;

		System.out.println("cuantas filas tendra la matriz");
		filas = teclado.nextInt(); // asigno cuantas filas va a tener

		System.out.println("cuantas columna tendra la matriz");
		columna = teclado.nextInt();// asigno cuantas columna va a tener

		int[] suma = new int[filas];
		int[][] numero = new int[filas][columna]; // creo las columna y la fila

		for (int i = 0; i < filas; i++) { // for para las filas

			for (int j = 0; j < columna; j++) { // for para las columna

				numero[i][j] = (int) (Math.random() * 9); // Math.random() ES GENERAR NUMERO ALEATORIO
				System.out.print(numero[i][j] + "  "); // muestro el resultado

			}
			System.out.println(); // para que se muestren en fila

		}

		// separando la suma y la primera matriz
		System.out.println();
		System.out.println("la suma de las filas de la matriz es ");
		System.out.println("-------------------------------------");

		for (int i = 0; i < filas; i++) { // for para las filas

			for (int j = 0; j < columna; j++) { // for para las columna

				suma[i] = suma[i] + numero[i][j];

			}

		}

		for (int i = 0; i < filas; i++) { // for para las filas
			System.out.print(suma[i] + "  "); // muestro el resultado
		}

	}

}
