package objeto2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCadenasCola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int opcion;
		ArrayList<String> lista = new ArrayList<>();
		String persona;

		do {

			System.out.println("1 : añadir a un cliente ");
			System.out.println("2 : coger entrada ");
			System.out.println("3 : listar cola ");
			System.out.println("4 : salir :) ");

			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:

				teclado.nextLine();

				System.out.println("dime el nombre del cliente que quieres añadir");
				persona = teclado.nextLine();

				System.out.println("la persona fue añadida");
				lista.add(persona);

				break;

			case 2:

				teclado.nextLine();

				if (!lista.isEmpty()) {

					System.out.println("entrada obtenida eliminando el primer cliente ");

					lista.remove(0);

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
					System.out.println("la cola esta vacia ");
				}

				break;

			case 4:

				System.exit(0);

			}

		} while (opcion != 4);

	}

}
