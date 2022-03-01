package clasepadre;

import java.util.Scanner;
import clasepadre.cola;

public class colamain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;

		cola cola = new cola();
		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("1: añadir una persona ");
			System.out.println("2: tratar persona de la cola ");
			System.out.println("3: listar ");
			System.out.println("4: salir ");
			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:

				teclado.nextLine();

				System.out.println("dime la persona que quieres añadir ");
				String persona = teclado.nextLine();

				System.out.println("persona " + persona + " añadida");

				cola.añadir(persona);
				System.out.println();

				break;

			case 2:

				persona = cola.tratar();

				break;

			case 3:

				if (!cola.isEmpty()) {

					for (int i = 0; i < cola.size(); i++) {
						System.out.println(cola.get(i));
					}

				}

				else {
					System.out.println("esta vacio");
				}

				break;

			case 4:

				System.exit(0);

				break;

			}

		} while (!(opcion == 4));

	}

}
