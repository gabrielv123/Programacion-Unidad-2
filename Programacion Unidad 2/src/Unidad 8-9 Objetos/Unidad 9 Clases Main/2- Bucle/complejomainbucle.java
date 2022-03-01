package objetos;

import java.util.Scanner;

public class complejomainbucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		ejercicio3_complejo c = new ejercicio3_complejo();
		ejercicio3_complejo fin = new ejercicio3_complejo(-1, -1);

		System.out.println("Introduce los datos del complejo c");
		c.leer(teclado);
		while (!c.equals(fin)) {

			// mientras no se introduzc el codigo del complejo fin seguira funcionando el
			// while

			System.out.println(c);

			System.out.println("introduce los datos del complejo c ");
			c.leer(teclado);
		}

		System.out.println("fin del programa ");
		teclado.close();

	}
}