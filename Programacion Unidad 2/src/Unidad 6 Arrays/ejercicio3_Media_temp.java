package evaluacion2a;

import java.util.Scanner;

public class ejercicio3_Media_temp {

	public ejercicio3_Media_temp() {
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		int n = 0, a=0;
		double media;

		int[] num = new int[10];

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		n = teclado.nextInt();
		int i = 0;

		while (n >= 273 && i < 10) {

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

		while (i < a) {

			if (num[i] > media) {

				System.out.println("mayor " + num[i]);

			}

			if (num[i] == media) {

				System.out.println("medio " + num[i]);

			}

			if (num[i] < media) {

				System.out.println("menor " + num[i]);

			}
		}
	}

}
