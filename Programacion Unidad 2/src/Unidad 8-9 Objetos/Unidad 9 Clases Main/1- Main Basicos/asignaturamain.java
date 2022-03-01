package objetos;

import java.util.Scanner;

public class ejercicio16_asignaturamain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print

		ejercicio15_Asignatura a1 = new ejercicio15_Asignatura();
		System.out.println(a1);

		ejercicio15_Asignatura a2 = new ejercicio15_Asignatura();
		System.out.println(a2);

		ejercicio15_Asignatura a3 = new ejercicio15_Asignatura("ED", "entorno de desarollo", 3.0);
		System.out.println(a3);

		// equals

		if (a1.equals(a2)) {
			System.out.println(a1 + " y " + a2 + "son iguales ");
		}

		else {
			System.out.println(a1 + " y " + a2 + "no son iguales ");
		}

		// compare to

		a2.setCodigo("prog");

		if (a2.compareTo(a3) > 0) {
			System.out.println(a1 + " es mayor que " + a2);
		}

		else if (a2.compareTo(a3) < 0) {
			System.out.println(a1 + " es menor que " + a2);
		}

		else {
			System.out.println(a1 + " es igual que " + a2);
		}

		// leer

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce los datos de la asignatura a2");
		a2.leer(teclado);

		System.out.println(a2);

		teclado.close();

	}
}
