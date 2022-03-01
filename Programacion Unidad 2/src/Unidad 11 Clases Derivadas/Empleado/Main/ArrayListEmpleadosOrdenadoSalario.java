package Clases_Base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListEmpleadosOrdenadoSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		ArrayList<Empleado> base = new ArrayList<>();
		Empleado añadir = new Empleado();

		String respuesta;

		do {

			añadir.leer(teclado);

			base.add(añadir);

			teclado.nextLine();

			System.out.println("deseas continuar en el programa");
			respuesta = teclado.nextLine();

		} while (respuesta.equals("si"));

		Collections.sort(base, new Comparator<Empleado>() {

			public int compare(Empleado A2, Empleado A3) {

				Double g1 = añadir.getSalario();
				Double g2 = añadir.getSalario();

				int comparacion = g1.compareTo(g2);

				if (comparacion == 0) {
					Persona p1 = new Persona(A2);
					Persona p3 = new Persona(A3);
					comparacion = p1.CompareTo(p3);
				}

				return (comparacion);

			}
		});
		
		for (int posicion = 0; posicion < base.size(); posicion++) {
			System.out.println("Empleado = " + base.get(posicion));
		}

	}

}
