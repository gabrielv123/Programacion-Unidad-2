package objeto2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListNumveces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int numero;
		int valor;
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int posicion = 0; posicion < 5; posicion++) {
			list.add(0);
		}

		System.out.println("introduce un numero entre 1 y 5");
		numero = teclado.nextInt();

		while (numero >= 1 && numero <= 5) {

			valor = list.get(numero - 1);
			valor++;
			list.set(numero - 1, valor);

			System.out.println("introduce un numero entre 1 y 5");
			numero = teclado.nextInt();
		}

		for (int posicion = 0; posicion < list.size(); posicion++) {
			valor = list.get(posicion);
			System.out.println(posicion + 1 + " : " + valor + " veces ");
		}

	}
}

/*
 * // int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0; switch (numero) {
 * 
 * case 1: c1++; break;
 * 
 * case 2: c2++; break;
 * 
 * case 3: c3++; break;
 * 
 * case 4: c4++; break;
 * 
 * case 5: c5++; break; }
 * 
 * } while (numero >= 1 && numero <= 5);
 * 
 * System.out.println("1: " +c1); System.out.println("2: " +c2);
 * System.out.println("3: " +c3); System.out.println("4: " +c4);
 * System.out.println("5: " +c5);
 */