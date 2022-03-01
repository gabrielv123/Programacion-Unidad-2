package objetos;

import java.util.Scanner;

public class asignaturabucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		ejercicio15_Asignatura c = new ejercicio15_Asignatura();

		System.out.println("Introduce los datos de la asignatura c");
		c.leer(teclado);
		while (c.getNota() >= 0.0) {

			// mientras no se introduzc el codigo del complejo fin seguira funcionando el while

			System.out.println(c);

			System.out.println("introduce los datos de la asignatura c ");
			c.leer(teclado);

		}

		System.out.println("fin del programa ");
		teclado.close();

	}

}
