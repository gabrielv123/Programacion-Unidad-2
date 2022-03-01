package evaluacion2;

import java.util.Scanner;

public class ejercicio20_Sumamat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int filas, columna;
		int datos = 0;

		System.out.println("cuantas filas tendra la matriz");
		filas = teclado.nextInt(); // asigno cuantas filas va a tener

		System.out.println("cuantas columna tendra la matriz");
		columna = teclado.nextInt();// asigno cuantas columna va a tener

		int[][] matriz1 = new int[filas][columna]; // creo las columna y la fila de la matriz 1

		int[][] matriz2 = new int[filas][columna]; // creo las columna y la fila de la matriz 2
		int[][] matriz3 = new int[filas][columna]; // creo las columna y la fila de la matriz 2

		// creacion de la matriz 1
		for (int i = 0; i < filas; i++) { // for para las filas

			for (int j = 0; j < columna; j++) { // for para las columna

				matriz1[i][j] = (int) (Math.random() * 9); // Math.random() ES GENERAR NUMERO ALEATORIO
				System.out.print(matriz1[i][j] + "  "); // muestro el resultado

			}

			System.out.println(); // para que se muestren en fila

		}

		// separando las dos matrizes
		System.out.println();
		System.out.println("la segunda matriz es : ");
		System.out.println("-------------------------");

		// creacion de la matriz 2
		for (int i = 0; i < filas; i++) { // for para las filas

			for (int j = 0; j < columna; j++) { // for para las columna

				matriz2[i][j] = (int) (Math.random() * 9); // Math.random() ES GENERAR NUMERO ALEATORIO
				System.out.print(matriz2[i][j] + "  "); // muestro el resultado

			}

			System.out.println(); // para que se muestren en fila

		}

		// separando la sumatoria las dos matrices
		System.out.println();
		System.out.println("la suma de las dos matrices es: ");
		System.out.println("-------------------------");

		// sumando las dos matrices
		for (int i = 0; i < matriz1.length; i++) { // for para las filas

			for (int j = 0; j < matriz1.length; j++) { // for para las columna

			}

			for (int j = 0; j < matriz2.length; j++) { // for para las columna

				matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}

		// mostrando la matriz sumada

		for (int i = 0; i < matriz1.length; i++) { // for para las filas

			for (int j = 0; j < matriz1.length; j++) { // for para las columna
				System.out.print(matriz3[i][j] + "  "); // muestro el resultado
			}

			System.out.println();

		}

	}
}
