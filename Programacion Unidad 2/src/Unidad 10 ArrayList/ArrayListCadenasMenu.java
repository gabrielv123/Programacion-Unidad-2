package objeto2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCadenasMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		boolean encontrado;
		int opcion = 0;
		String palabra, salir = null;
		ArrayList<String> lista = new ArrayList<>();

		do {

			System.out.println("1: pedir un String ");
			System.out.println("2: buscar el array ");
			System.out.println("3: borrar String ");
			System.out.println("4: Listar array ");
			System.out.println("5: salir ");

			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:

				teclado.nextLine();
				
				System.out.println("dime un String para añadir ");
				palabra = teclado.nextLine();
				lista.add(palabra);

				break;

			case 2:

				teclado.nextLine();
				
				System.out.println("dime un String para buscar ");
				palabra = teclado.nextLine();

				if (lista.contains(palabra)) {
					int posicion = 0;
					encontrado = false;

					for (int i = 0; i < lista.size() && encontrado == false; i++) {
						if (palabra.equals(lista.get(i))) {
							posicion = i;
							encontrado = true;
						}
					}

					System.out.println("La palabra se encuentra en la posicion " + posicion);

				}

				else {
					System.out.println("error, no se encuentra la palabra");
				}

				break;

			case 3:
				
				teclado.nextLine();

				System.out.println("dime un String para buscar ");
				palabra = teclado.nextLine();

				if (lista.contains(palabra)) {
					int posicion = 0;
					encontrado = false;

					for (int i = 0; i < lista.size() && encontrado == false; i++) {
						if (palabra.equals(lista.get(i))) {
							posicion = i;
							encontrado = true;
						}

						System.out.println("encontrado ");
						lista.remove(i);
					}

				}

				else {

					System.out.println("error, no encontrado ");

				}

				break;

			case 4:

				System.out.println(lista);
				break;

			case 5:

				System.out.println("adios, no me hables mas");
				System.exit(0);
				break;

			default:
				break;
			}


		} while (opcion !=5);
		
		

		teclado.close();

	}
}
