package examen2;

import java.util.ArrayList;
import java.util.Scanner;

import especiales.CuentaCorriente;

public class contactoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int elementos;
		int posicion;
		boolean encontrado;
		int opcion;
		String persona;

		ArrayList<contacto> base = new ArrayList<>();

		do {

			System.out.println("introduce una opcion");
			System.out.println("-------------------------------------------------------------");
			System.out.println("opcion 1: añadir contacto");
			System.out.println("opcion 2: buscar contacto");
			System.out.println("opcion 3: borrar eliminar contacto");
			System.out.println("opcion 4: listar contacto");
			System.out.println("opcion 5: mostar numero de habitantes");
			System.out.println("opcion 6: Salir ");

			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:

				contacto Cliente = new contacto();

				if (!base.contains(Cliente)) {

					teclado.nextLine();
					Cliente.leer(teclado);
					base.add(Cliente);

				}

				else {

					System.out.println("ya esta en la cuenta ");
				}

				break;

			case 2:

				teclado.nextLine();

				System.out.println("dime el dni ");
				int dni = teclado.nextInt();

				encontrado = false;

				for (int i = 0; i < base.size(); i++) {
					if (base.get(i).getDni() == dni) {
						encontrado = true;

					}

					if (encontrado) {

						System.out.println("la persona se encuentra en la posicion " + i);
					}
				}

				if (!encontrado) {
					System.out.println("la persona no esta en la cuenta");
				}

				break;

			case 3:

				teclado.nextLine();

				System.out.println("dime el nombre de la persona");
				persona = teclado.nextLine();

				encontrado = false;

				for (int i = 0; i < base.size();) {
					if (base.get(i).getNombre().equals(persona)) {
						encontrado = true;

					}

					if (encontrado) {
						base.remove(i);
						System.out.println("la persona se ha borrado de la base ");
					}

					else {
						System.out.println("la persona no se encontro");
					}
				}

				break;

			case 4:

				teclado.nextLine();

				for (int i = 0; i < base.size(); i++) {
					System.out.println(base.get(i));
				}

				break;

			case 5:

				teclado.nextLine();

				System.out.println("dime el numero de telefono ");
				String telefono = teclado.nextLine();

				encontrado = false;

				for (int i = 0; i < base.size();) {
					if (base.get(i).getTelefono().equals(telefono)) {
						int habitante = base.get(i).getHabitantes();
						encontrado = true;
						System.out.println(" la cantidad de habitantes son " + habitante);
					}

					i++;
				}

				if (!encontrado) {
					System.out.println("el numero de telefono no esta en la lista");
				}

				break;

			case 6:

				System.exit(0);

			}

		} while (opcion != 6);

	}
}