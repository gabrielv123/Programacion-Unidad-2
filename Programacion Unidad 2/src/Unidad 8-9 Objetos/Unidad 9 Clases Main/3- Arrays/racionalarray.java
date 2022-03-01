package objetos;

import java.util.Scanner;

public class racionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		ejercicio1_racional r = new ejercicio1_racional();
		ejercicio1_racional fin = new ejercicio1_racional(0, -1);
		ejercicio1_racional[] c1 = new ejercicio1_racional[10];
		int elementos;

		System.out.println("Introduce los datos del complejo c");
		r.leer(teclado);
		elementos = 0;

		while (!r.equals(fin) && elementos < c1.length) {

			// mientras no se introduzc el codigo del complejo fin seguira funcionando el
			// while

			c1[elementos] = new ejercicio1_racional(r);

			elementos++;

			System.out.println("introduce los datos del complejo c ");
			r.leer(teclado);
		}

		teclado.close();

		for (int i = 0; i < elementos; i++) {
			System.out.println(c1[i]);
		}

		System.out.println("fin del programa ");

	}
}