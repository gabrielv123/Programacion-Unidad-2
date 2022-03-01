package objeto2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistTemperaturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero;
		ArrayList<Double> list = new ArrayList<Double>();

		double media;
		boolean fin;

		do {

			fin = true;
			System.out.println("introduce una temperatura");
			numero = teclado.nextInt();

			if (numero != -999) {

				fin = true;
				list.add((double) numero);
				System.out.println(" temperatura : " + numero + " introducida ");
			}

			else {
				fin = false;
			}

		} while (fin != false);

		int mayor = 0, menor = 0, igual = 0;

		double total = 0;

		for (Double i : list) {
			total = total + i;

		}

		media = total / list.size();

		for (Double i : list) {
			
			if (i > media) {
				mayor++;
				System.out.println("mayor " + mayor);

			}

			else if (i < media) {
				menor++;
				System.out.println("menor " + menor);

			}

			else {
				igual++;
				System.out.println("igual " + igual);

			}

			System.out.println(i);
		}

		System.out.println("La media es : " + media);
		System.out.println("Hay " + mayor + " temperaturas mayor que la media");
		System.out.println("Hay " + menor + " temperaturas menor que la media");
		System.out.println("Hay " + igual + " temperaturas iguales que la media");

	}
}