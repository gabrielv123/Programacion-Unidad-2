package objeto2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero;
		ArrayList<Integer> list = new ArrayList<Integer>();

		double media;

		do {

			System.out.println("introduce un numero");
			numero = teclado.nextInt();

			if (numero > 0) {

				list.add(numero);
				System.out.println(" numero : " + numero + " introducido ");
			}

		} while (numero > 0);

		int total = 0;

		for (int i : list) {
			total = total + i;
		}

		media = (double)total / (double)list.size();

		System.out.println("la media es: " + media);

	}
}