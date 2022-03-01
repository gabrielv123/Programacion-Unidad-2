package objetos;

import java.util.Scanner;

import objetos.ejercicio1_racional;

public class ejercicio2_racionalmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// clase para probar la clase racional //viejo

		ejercicio1_racional r1 = new ejercicio1_racional();
		ejercicio1_racional r2 = new ejercicio1_racional(2, 3);
		ejercicio1_racional r3 = new ejercicio1_racional(3);
		ejercicio1_racional r4 = new ejercicio1_racional(r2);

		// escribir //viejo

		r1.escribir();
		r2.escribir();
		r3.escribir();
		r4.escribir();

		System.out.println();

		ejercicio1_racional c1 = new ejercicio1_racional();
		System.out.println(c1);

		ejercicio1_racional c2 = new ejercicio1_racional();
		System.out.println(c2);

		ejercicio1_racional c3 = new ejercicio1_racional();
		System.out.println(c3);

		ejercicio1_racional c4 = new ejercicio1_racional();
		System.out.println(c4);

		System.out.println();

		// getter and setters

		int n;
		n = c4.getNumerador();
		int d;

		d = c4.getDenominador();
		System.out.println("numerador: " + n + "Denominador:" + d);

		System.out.println();

		// hash code equals

		r4.setNumerador(4);
		r4.setDenominador(6);
		if (r4.equals(r2)) {
			System.out.println(r4 + " y " + r2 + " son iguales");
		}

		else {
			System.out.println(r4 + " y " + r2 + " no son iguales");
		}

		System.out.println();

		// compare to

		if (r4.compareTo(r2) > 0) {
			System.out.println(r4 + "es mayor que " + r2);
		}

		else if (r4.compareTo(r2) < 0) {
			System.out.println(r4 + "es menor que " + r2);
		}

		else {
			System.out.println(r4 + "es igual que " + r2);
		}

		System.out.println();

		// leer

		Scanner teclado = new Scanner(System.in);

		// leo r1

		System.out.println("racional");
		r1.leer(teclado);

		// saco el valor por pantalla

		System.out.println("racional leido: " + r1);

		// cierro teclado

		teclado.close();

	}

}
