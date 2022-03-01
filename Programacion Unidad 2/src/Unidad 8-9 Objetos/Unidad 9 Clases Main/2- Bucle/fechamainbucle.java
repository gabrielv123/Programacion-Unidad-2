package objetos;

import java.util.Scanner;

public class fechamainbucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		ejercicio11_fecha c = new ejercicio11_fecha();
		ejercicio11_fecha fin = new ejercicio11_fecha(0, 0, 0);

		System.out.println("Introduce los datos de la fecha c");
		c.leer(teclado);
		while (!c.equals(fin)) {

			// mientras no se introduzc el codigo del complejo fin seguira funcionando el
			// while

			System.out.println(c);

			System.out.println("introduce los datos de la fecha c ");
			c.leer(teclado);

		}

		System.out.println("fin del programa ");
		teclado.close();

	}

}
