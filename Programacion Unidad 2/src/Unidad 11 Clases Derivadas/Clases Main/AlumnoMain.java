package Clases_Main;

import java.util.Scanner;

import Clases_Base.fecha;
import Clases_Herencia.Alumno;

public class AlumnoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno A1 = new Alumno();
		System.out.println(A1);

		Alumno A2 = new Alumno("456939309", "gabriel", "vargas ", new fecha(), "2");
		System.out.println(A2);

		Alumno A3 = new Alumno(A2);
		System.out.println(A3);

		System.out.println("---------------------");
		System.out.println();

		// getter and setter

		A2.setDni("89380");
		A3.setNombre("manuel");
		A3.setGrupo("2AW3");

		fecha f = new fecha(5, 2, 2019);
		f.setAño(2020);

		System.out.println("modificado " + A2);
		System.out.println("modificado " + A3);
		System.out.println("modificado " + f);

		System.out.println("---------------");
		System.out.println();

		// hash code and equals

		A2.setDni("01");
		if (A3.equals(A2)) {
			System.out.println(A3 + " y " + A2 + " son iguales ");
		}

		else {
			System.out.println(A3 + " y " + A2 + " no son iguales ");
		}

		System.out.println("---------------");
		System.out.println();

		// compare to

		if (A3.compareTo(A2) < 0) {
			System.out.println(A3 + " es menor que " + A2);
		}

		if (A3.compareTo(A2) > 0) {
			System.out.println(A3 + " es mayor que " + A2);
		}

		else {
			System.out.println(A3 + " es igual que " + A2);
		}

		System.out.println("---------------");
		System.out.println();

		// leer

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("datos : ");
		A1.leer(teclado);

		System.out.println("persona: " + A1);

	}

}
