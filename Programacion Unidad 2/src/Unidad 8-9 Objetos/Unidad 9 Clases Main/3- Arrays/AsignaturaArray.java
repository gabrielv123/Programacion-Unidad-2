package objetos;

import java.util.Scanner;

public class AsignaturaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		ejercicio15_Asignatura f = new ejercicio15_Asignatura();
		ejercicio15_Asignatura[] c1 = new ejercicio15_Asignatura[10];
		int elementos;

		System.out.println("Introduce los datos del complejo c");
		f.leer(teclado);
		elementos = 0;

		while (f.getNota() >=0 && elementos < c1.length) {

			// mientras no se introduzc el codigo del complejo fin seguira funcionando el
			// while

			c1[elementos] = new ejercicio15_Asignatura(f);

			elementos++;

			System.out.println("introduce los datos del complejo c ");
			f.leer(teclado);
		}

		teclado.close();

		for (int i = 0; i < elementos; i++) {
			System.out.println(c1[i]);
		}

		System.out.println("fin del programa ");

	}
}