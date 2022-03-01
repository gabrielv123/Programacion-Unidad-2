package Clases_Base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListEmpleadosMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

//--------------------------------------------------------------------------------case 2 -----------------------------------------------------------------------------------------//		
		
		ArrayList<Empleado> base = new ArrayList<>();
		int opcion;
		boolean encontrado;

		Empleado añadir = new Empleado(); // inicializo añadir aqui para cambiar el compareTo en el case 5

//--------------------------------------------------------------------------------case 2 -----------------------------------------------------------------------------------------//		
		
		do {

			System.out.println("1 : añadir");
			System.out.println("2 : buscar");
			System.out.println("3 : borrar");
			System.out.println("4 : listar");
			System.out.println("5 : listar por sueldo");

			opcion = teclado.nextInt();

			switch (opcion) {
			
//--------------------------------------------------------------------------------case 2 -----------------------------------------------------------------------------------------//

			// añadir empleado
			
			case 1:

				teclado.nextLine();

				añadir.leer(teclado);

				if (!base.contains(añadir)) { // pongo la condicion para que no sea un valor repetido

					base.add(añadir);

					Collections.sort(base);

				}

				else {

					System.out.println("ya esta en la cuenta ");
				}

				break;

//--------------------------------------------------------------------------------case 2 -----------------------------------------------------------------------------------------//

				// buscar empleado 
				
			case 2:

				teclado.nextLine();

				Empleado buscar = new Empleado();

				buscar.leer(teclado);

				int pos = 0;

				encontrado = false;

				for (int i = 0; i < base.size() && encontrado == false; i++) {
					if (base.contains(buscar)) {
						encontrado = true;

					}

					pos = i; // inicializo esta variale para que solo muestre el mensaje de la posicion una
								// sola vez
				}

				if (encontrado) {

					System.out.println("la persona se encuentra en la posicion " + pos); // mostrar la posicion
				}

				if (!encontrado) {

					System.out.println("la persona no esta en la cuenta ");
				}

				break;

//--------------------------------------------------------------------------------case 3 -----------------------------------------------------------------------------------------//

			// borrar empleado
				
			case 3:

				teclado.nextLine();

				Empleado Borrar = new Empleado(); // declaro el cliente borrar derivado de contacto

				Borrar.leer(teclado); // llamo el metodo leer

				int posborrar = 0;
				encontrado = false;

				for (int i = 0; i < base.size(); i++) {
					if (base.contains(Borrar)) { // este if dice que si contiene exactamente todos los datos de la
													// persona
													// lo borre
						encontrado = true;

					}

					posborrar = i; // inicializo esta variale para que solo muestre el mensaje de borrar una sola
									// vez
				}

				if (encontrado) {
					base.remove(posborrar); // si lo encuentra lo borra
					System.out.println("la persona se ha borrado de la base ");

				}

				else {
					System.out.println("la persona no se encontro");
				}

				break;

//--------------------------------------------------------------------------------case 4 -----------------------------------------------------------------------------------------//

			// listar de forma ordenada en funcion de su dni

			case 4:

				Collections.sort(base);

				for (int i = 0; i < base.size(); i++) {
					System.out.println(base.get(i)); // un for que recorre el array y lo va mostrando lo que tiene
				}

				break;
				
//--------------------------------------------------------------------------------case 5 -----------------------------------------------------------------------------------------//

				// listar en funcion de su salario
				
			case 5:

				Collections.sort(base, new Comparator<Empleado>() {

					public int compare(Empleado A2, Empleado A3) {

						Double g1 = añadir.getSalario();
						Double g2 = añadir.getSalario();

						int comparacion = g1.compareTo(g2);

						if (comparacion == 0) {
							Persona p1 = new Persona(añadir);
							Persona p3 = new Persona(añadir);
							comparacion = p1.CompareTo(p3);
						}

						return (-comparacion);

					}
				});

				for (int i = 0; i < base.size(); i++) {
					System.out.println(base.get(i)); // un for que recorre el array y lo va mostrando lo que tiene
				}

				break;

			}
			
//-------------------------------------------------------------------------------- fin -----------------------------------------------------------------------------------------//

		} while (opcion != 0);

	}

}
