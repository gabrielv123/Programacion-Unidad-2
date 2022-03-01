package evaluacion2;

import java.util.Scanner;

public class ejercicio19_Traspues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int filas, columna;
		int datos = 0;

		System.out.println("cuantas filas tendra la matriz");
		filas = teclado.nextInt(); // asigno cuantas filas va a tener

		System.out.println("cuantas columna tendra la matriz");
		columna = teclado.nextInt();// asigno cuantas columna va a tener

		int[][] numero = new int[filas][columna]; // creo las columna y la fila

		// matriz normal

		for (int i = 0; i < filas; i++) { // for para las filas

			for (int j = 0; j < columna; j++) { // for para las columna

				numero[i][j] = (int) (Math.random() * 9); // Math.random() ES GENERAR NUMERO ALEATORIO
				System.out.print(numero[i][j] + "  "); // muestro el resultado

			}
			System.out.println(); // para que se muestren en fila

		}

		//separando las dos matrizes 
		System.out.println();
		System.out.println("matriz compuesta es : ");
		System.out.println("-------------------------");

		// transponiendo la matriz

		int tran;
		for (int i = 0; i < filas; i++) { // for para las filas transpuesta

			for (int j = 0; j < i; j++) { // for para las columna transpuesta
				tran = numero[i][j];
				numero[i][j] = numero[j][i];
				numero[j][i] = tran;
			}
		}

		// mostrando la matriz transpuesta

		for (int i = 0; i < filas; i++) { // for para las filas

			for (int j = 0; j < columna; j++) { // for para las columna
				System.out.print(numero[i][j] + "  "); // muestro el resultado

			}
			System.out.println(); // para que se muestren en fila
		}
	}
}
