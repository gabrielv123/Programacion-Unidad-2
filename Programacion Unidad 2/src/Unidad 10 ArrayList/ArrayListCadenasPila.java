package objeto2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCadenasPila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int opcion;
		ArrayList<String> lista = new ArrayList<>();
		String libro;

		do {

			System.out.println("1 : añadir a un libro ");
			System.out.println("2 : coger un libro ");
			System.out.println("3 : listar libros ");
			System.out.println("4 : salir :) ");

			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:

				teclado.nextLine();

				System.out.println("dime el nombre del libro que quieres añadir");
				libro = teclado.nextLine();

				System.out.println("el libro fue añadida");
				lista.add(libro);

				break;

			case 2:

				// coje el ultimo libro del array

				teclado.nextLine();
				
				if (!lista.isEmpty()) {

				System.out.println("entrada obtenida eliminando el primer cliente ");

				lista.remove(lista.size() - 1);

				}
				
				else {

					System.out.println("esta vacio el almacen");
				}

				break;

			case 3:

				if (!lista.isEmpty()) {

					for (int i = 0; i < lista.size(); i++) {
						System.out.println(lista.get(i));
					}

				}

				else {
					System.out.println("el almacen esta vacio ");
				}

				break;

			case 4:

				System.exit(0);

			}

		} while (opcion != 4);

	}

}
