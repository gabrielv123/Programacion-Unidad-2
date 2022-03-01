package objetos;

import java.util.Scanner;

public class ejercicio12_fechamain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// clase para probar la clase racional

		/*ejercicio11_fecha r1 = new ejercicio11_fecha();
		ejercicio11_fecha r2 = new ejercicio11_fecha(2,7,2021);
		ejercicio11_fecha r3 = new ejercicio11_fecha(8,8,2021);
		ejercicio11_fecha r4 = new ejercicio11_fecha(r2);

		// escribir

		r1.escribir();
		r2.escribir();
		r3.escribir();
		r4.escribir();*/

	System.out.println();

		// leer

		ejercicio11_fecha c1 = new ejercicio11_fecha();
		System.out.println(c1);

		ejercicio11_fecha c2 = new ejercicio11_fecha(2,7,2021);
		System.out.println(c2);

		ejercicio11_fecha c3 = new ejercicio11_fecha(8,8,2021);
		System.out.println(c3);

		ejercicio11_fecha c4 = new ejercicio11_fecha(c2);
		System.out.println(c4);

		System.out.println();

		// getter y setter

		int r;
		r = c2.getDia(); // c2
		System.out.println("dia: "  + r);

		c3.setDia(2,7,2021);

		int i;

		i = c2.getMes();
		System.out.println("mes: " + i);

		c4.setMes(8,8,2021);
		System.out.println(c4);

		// hash code and equals

		if (c4.equals(c2)) {
			System.out.println(c4 + " y " + c2 + "son iguales ");
		}

		else {
			System.out.println(c4 + " y " + c2 + "no son iguales ");
		}

		System.out.println();

		// compare to

		if (c4.compareTo(c2) < 0) {
			System.out.println(c4 + " es menor que " + c2);
		}

		if (c4.compareTo(c2) > 0) {
			System.out.println(c4 + " es mayor que " + c2);
		}

		else {
			System.out.println(c4 + " es igual que " + c2);
		}

		System.out.println();

		// leer

		Scanner teclado = new Scanner(System.in);

		// leo c1
		System.out.println("fecha");
		c1.leer(teclado);
		System.out.println("fecha leida" + c1);

		// cierre de teclado
		teclado.close();

	}

}