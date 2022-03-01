package objetos;

import java.util.Scanner;

public class complejoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		ejercicio3_complejo c = new ejercicio3_complejo();
		ejercicio3_complejo fin = new ejercicio3_complejo(-1, -1);
		ejercicio3_complejo[] c1 = new ejercicio3_complejo[10];
		int elementos;

		System.out.println("Introduce los datos del complejo c");
		elementos = 0;

		while (!c.equals(fin) && elementos < c1.length) {

			// mientras no se introduzc el codigo del complejo fin seguira funcionando el
			// while

			c1[elementos] = new ejercicio3_complejo(c);

			System.out.println("introduce los datos del complejo c ");
			c.leer(teclado);

			elementos++;
			c.leer(teclado);
		}

		System.out.println("fin del programa ");
		teclado.close();
		
		for (int i = 0; i<c1.length;i++) {
			System.out.println(c1[i]);
		}

	}
}
