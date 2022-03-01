package examen2;

import java.util.Scanner;

public class viaje {

	public static void main(String[] args) {
		// TODO Auto-generated method stubç

		Scanner teclado = new Scanner(System.in);

		int cantidad;
		Double n = 0.0;
		boolean fin = false;
		int contador = 0;

		int i = 5;
		int e = 5;
		int a = 0;
		double media;

		Double[] viaje = new Double[10];

		viaje[0] = 100.1;
		viaje[1] = 200.2;
		viaje[2] = 300.3;
		viaje[3] = 400.4;
		viaje[4] = 500.5;

		while (n >= 0 && e < 10) {

			viaje[i] = n;
			e = e + 1;
			
			
				System.out.println("Introduce un numero, para parar pon un numero negativo");
				n = teclado.nextDouble();
			
			
			a = a + 1;

		}

		i = 0;

		while (i < 5) {

			n = n + viaje[i];
			i = i + 1;
		}

		media = n / a;
		System.out.println("media de todo es" + media);

	}
}
