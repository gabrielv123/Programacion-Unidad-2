package evaluacion2a;

import java.util.Scanner;

public class ejercicio4_num_primo {

	public ejercicio4_num_primo() {
		// TODO Auto-generated constructor stubç
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0, a = 0;
		double media;

		int[] num = new int[5];

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		n = teclado.nextInt();
		int i = 0;

		while (n >= 0 && i < 5) {

			num[i] = n;
			i = i + 1;
			System.out.println("Introduce un numero");
			n = teclado.nextInt();
			a = a + 1;

		}

		i = 0;
		n = 0;

		while (i < 5) {

			n = n + num[i];
			i = i + 1;
		}

		media = n / a;
		System.out.println("media es" + media);

		i = 0;

		int suma = n;

		System.out.println("suma es" + suma);

		boolean comprobar = true;

		int i1 = 3;

		while (i1 < suma) {

			i1 = i + 2;

			if (suma % i == 0) {
				comprobar = false;
			}

			if (suma % 2 == 0) {
				comprobar = false;
			}

			if (comprobar = true) {

				System.out.println("es primo");
			}

			else {
				System.out.println("no es primo");
			}
		}

	}

}
