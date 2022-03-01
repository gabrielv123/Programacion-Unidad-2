package evaluacion2a;

import java.util.Scanner;

public class ejercicio2_media_num {

	public ejercicio2_media_num() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, e = 0, a = 0;
		double media;

		int[] num = new int[5];

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		n = teclado.nextInt();
		int i = 0;

		while (n >= 0 && i < 5) {

			num[i] = n;
			e = e + 1;
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

	}

}
