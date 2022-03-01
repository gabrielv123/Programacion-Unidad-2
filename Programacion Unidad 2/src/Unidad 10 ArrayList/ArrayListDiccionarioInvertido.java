package objeto2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDiccionarioInvertido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		ArrayList<String> lista = new ArrayList<String>();
		String palabra;
		int opcion;
		boolean encontrado = false;
		int posicion;

		do {

			System.out.println("1: añadir palabra");
			System.out.println("2: buscar palabra");
			System.out.println("3: borrar palabra");
			System.out.println("4: listar palabra");
			System.out.println("5: salir");

			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:

				teclado.nextLine();

				System.out.println("que palabra quieres añadir ");
				palabra = teclado.nextLine();

				if (lista.contains(palabra)) {

					System.out.println("error, la palabra ya esta añadida");
				}

				else {
					lista.add(palabra);
					System.out.println("palabra añadida");
				}

				break;

			case 2:

				teclado.nextLine();

				System.out.println("dime la palabra que quieres encontrar");
				palabra = teclado.nextLine();

				if (lista.contains(palabra)) {
					posicion = 0;
					encontrado = false;

					for (int i = 0; i < lista.size() && encontrado == false; i++) {
						if (palabra.equals(lista.get(i))) {
							posicion = i;
							encontrado = true;
						}
					}

					System.out.println("la palabra : " + palabra + " se encuentra en la posicion : " + posicion);
				}

				else {

					System.out.println("error, no se encuentra la palabra ");

				}

				break;

			case 3:

				teclado.nextLine();

				System.out.println("dime la palabra que quieres encontrar");
				palabra = teclado.nextLine();

				if (lista.contains(palabra)) {
					posicion = 0;
					encontrado = false;

					for (int i = 0; i < lista.size() && encontrado == false; i++) {
						if (palabra.equals(lista.get(i))) {
							posicion = i;
							encontrado = true;
						}

						lista.remove(i);
						System.out.println("la palabra : " + palabra + " se encuentra en la posicion : " + posicion);
					}

				}

				else {

					System.out.println("error, no se encuentra la palabra ");

				}

				break;

			case 4:

				Collections.sort(lista,Collections.reverseOrder());
				System.out.println(lista);

				break;

			case 5:

				System.out.println("adios, no me hables mas");
				System.exit(0);
				break;

			default:
				break;
			}

		} while (opcion != 5);

		teclado.close();
	}

}
