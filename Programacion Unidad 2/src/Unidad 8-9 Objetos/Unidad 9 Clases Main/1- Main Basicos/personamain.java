package Clases_Main;

import java.util.Scanner;

import Clases_Base.Persona;
import Clases_Base.fecha;

public class personamain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1 = new Persona();
		System.out.println(p1);

		Persona p2 = new Persona("456939309", "gabriel", "vargas ", new fecha());
		System.out.println(p2);

		Persona p3 = new Persona(p2);
		System.out.println(p3);

		System.out.println("---------------");

		// getter and setter

		p2.setDni("2");
		p2.setApellido("yyy");
		p3.setNombre("oo");

		fecha f = new fecha(8, 1, 2019);
		f.setAño(2020);

		System.out.println("modificado " + p2);
		System.out.println("modificado " + p3);
		System.out.println("modificado " + f);

		System.out.println("---------------");

		// hash code and equals

		p2.setDni("01");
		if (p3.equals(p2)) {
			System.out.println(p3 + " y " + p2 + "son iguales ");
		}

		else {
			System.out.println(p3 + " y " + p2 + "no son iguales ");
		}

		System.out.println();

		// compare to

		if (p3.compareTo(p2) < 0) {
			System.out.println(p3 + " es menor que " + p2);
		}

		if (p3.compareTo(p2) > 0) {
			System.out.println(p3 + " es mayor que " + p2);
		}

		else {
			System.out.println(p3 + " es igual que " + p2);
		}

		System.out.println("---------------");

		System.out.println();

		// leer

		Scanner teclado = new Scanner(System.in);

		// leo c1
		System.out.println("datos persona ");
		p1.leer(teclado);
		System.out.println("persona " + p1);

		// cierre de teclado
		teclado.close();

	}

}
