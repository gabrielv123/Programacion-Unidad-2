package objetos;

import java.util.Scanner;

public class RacionalMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		ejercicio1_racional valor = new ejercicio1_racional();
		ejercicio1_racional[] c1 = new ejercicio1_racional[10];
		int elementos;
		int posicion;
		boolean encontrado;
		int opcion;

		System.out.println("que opcion deseas");

		elementos = 0;

		do {

			System.out.println("introduce una opcion");
			System.out.println("-------------------------------------------------------------");
			System.out.println("opcion 1: añadir complejo");
			System.out.println("opcion 2: buscar complejo");
			System.out.println("opcion 3: borrar complejo");
			System.out.println("opcion 4: listar complejos");
			System.out.println("opcion 5: Salir ");

			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:

				if (elementos < c1.length) {

					System.out.println("valor: ");

					valor.leer(teclado);

					posicion = 0;
					encontrado = false;

					while (posicion < elementos && !encontrado) {
						if (c1[posicion].compareTo(valor) > 0) {

							encontrado = true;
						} else {
							posicion++;
						}

					}
					for (int posicionmover = elementos; posicionmover > posicion; posicionmover--) {
						c1[posicionmover] = c1[posicionmover - 1];
					}

					c1[posicion] = new ejercicio1_racional(valor);
					elementos++;

				}

				else {
					System.out.println(" no se puede añadir porque el array esta lleno ");
				}

				break;

			case 2:

				System.out.println("valor:");
				valor.leer(teclado);

				posicion = 0;
				encontrado = false;

				while (posicion < elementos && !encontrado) {
					if (c1[posicion].compareTo(valor) == 0) {
						encontrado= true;

					} else {
						posicion++;
					}

				}
				if (encontrado) {
					System.out.println("elemento " + valor + "encontrado en la posicicion " + posicion);
				}

				else {
					System.out.println("elemento " + valor + "no encontrado");
				}
				break;

			case 3:

				System.out.println("valor:");
				valor.leer(teclado);

				posicion = 0;
				encontrado = false;

				while (posicion < elementos && !encontrado) {

					if (c1[posicion].compareTo(valor) == 0) {
						encontrado = true;

					}

					else {
						posicion++;
					}
				}
				if (encontrado) {

					for (int posicionmover = posicion; posicionmover < (elementos - 1); posicionmover++) {
						c1[posicionmover] = c1[posicionmover + 1];
					}

					System.out.println(" elemento borrado ");
					elementos--;
				}

				else {
					System.out.println("error al borrar. no se encuentra el elemento");
				}

				break;

			case 4:

				for (posicion=0;posicion<elementos;posicion++) {
					System.out.println("mostrando numero " + c1[posicion]);

				}

				
				break;

			case 5:

				System.out.println("adios");
				

				break;

			}
		} while (opcion !=5);

	}
}
