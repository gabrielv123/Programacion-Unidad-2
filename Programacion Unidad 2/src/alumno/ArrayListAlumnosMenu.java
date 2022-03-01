package alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListAlumnosMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

//--------------------------------------------------------------------------------declaracion del array variables y variables -----------------------------------------------------------------------------------------//		

		ArrayList<Alumno> base = new ArrayList<>();
		int opcion;
		boolean encontrado;

//--------------------------------------------------------------------------------menu-----------------------------------------------------------------------------------------//

		do {

			System.out.println("1 : a�adir");
			System.out.println("2 : buscar");
			System.out.println("3 : borrar");
			System.out.println("4 : listar");

			opcion = teclado.nextInt();

			switch (opcion) {

//--------------------------------------------------------------------------------case 1 -----------------------------------------------------------------------------------------//

			case 1:

				teclado.nextLine();

				Alumno a�adir = new Alumno();

				a�adir.leer(teclado);

				if (!base.contains(a�adir)) { // pongo la condicion para que no sea un valor repetido

					base.add(a�adir);

					Collections.sort(base);

				}

				else {

					System.out.println("ya esta en la cuenta ");
				}

				break;

//--------------------------------------------------------------------------------case 2 -----------------------------------------------------------------------------------------//

			case 2:

				teclado.nextLine();

				Alumno buscar = new Alumno();

				buscar.leer(teclado);

				int pos = base.indexOf(buscar); // busca por posicion en el array
				
				if (pos >= 0) { // pongo la condicion que si posicion es mayor a 0 quiere decir que lo encontro y lo muestra
					
					System.out.println(" la persona " +buscar+ " se encuentra en la posicion " +pos);
					
				}
				
				else {
					System.out.println("no se encuentra"); //si no existe 
				}
/*
				encontrado = false;

				for (int i = 0; i < base.size() && encontrado == false; i++) {
					if (base.contains(buscar)) {
						encontrado = true;
						System.out.println(base.get(i));
					} 
					
					else {

						System.out.println("la persona no esta en la cuenta ");
					}
				}*/

				break;

//--------------------------------------------------------------------------------case 3 -----------------------------------------------------------------------------------------//

			case 3:

				teclado.nextLine();

				Alumno Borrar = new Alumno(); // declaro el cliente borrar derivado de contacto

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

			// listar

			case 4:

				teclado.nextLine();

				for (int i = 0; i < base.size(); i++) {
					System.out.println(base.get(i)); // un for que recorre el array y lo va mostrando lo que tiene
				}

				break;
			}

		} while (opcion != 0);

	}

}