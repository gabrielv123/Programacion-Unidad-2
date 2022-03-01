package objetos;

import java.util.Scanner;

public class racionalmainbucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		ejercicio1_racional c = new ejercicio1_racional();
		ejercicio1_racional fin = new ejercicio1_racional(-0, -1);

		System.out.println("Introduce los datos del racional c");
		c.leer(teclado);
		while (!c.equals(fin)) {
			
			// mientras no se introduzc el codigo del complejo fin seguira funcionando el while
			
			System.out.println(c);

			System.out.println("introduce los datos del racional c ");
			c.leer(teclado);
		}

		System.out.println("fin del programa ");
		teclado.close();

	}
}