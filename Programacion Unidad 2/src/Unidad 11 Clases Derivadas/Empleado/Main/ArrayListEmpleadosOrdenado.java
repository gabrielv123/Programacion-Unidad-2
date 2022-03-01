package Clases_Base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEmpleadosOrdenado {

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
		
		Collections.sort(base);

		for (int posicion = 0; posicion < base.size(); posicion++) {
			System.out.println("persona = " + base.get(posicion));
		}
	}

}
