package alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEmpleadosOrdenado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		ArrayList<Empleado> base = new ArrayList<>();


	
		String respuesta;

		do {
			
			Empleado añadir = new Empleado();

			añadir.leer(teclado);

			base.add(añadir);

			teclado.nextLine();

			System.out.println("deseas salir del programa");
			respuesta = teclado.nextLine();

		} while (!respuesta.equals("si"));
		
		Collections.sort(base);

		for (int posicion = 0; posicion < base.size(); posicion++) {
			System.out.println("persona = " + base.get(posicion));
		}
	}

}
