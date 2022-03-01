package evaluacion2a;

import java.util.Scanner;

public class ejercicio1num_veces {

	public ejercicio1num_veces() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, c;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		n = teclado.nextInt();

		int[] a = new int[10]; // defino array

		while (n >= 0 && n <= 9) {

			a[n] = a[n] + 1;
			System.out.println("introduce un numero 0 a 9");
			n = teclado.nextInt();
		}

		c = 0; 

		while (c < 10) {

			System.out.println(+c + " : " + a[c] + " veces ");
			c = c + 1;
		}

	}

}
