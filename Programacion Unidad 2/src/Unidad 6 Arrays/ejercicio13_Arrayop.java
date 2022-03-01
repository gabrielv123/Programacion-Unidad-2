package evaluacion2a;

import java.util.Scanner;

public class ejercicio13_Arrayop {

	public ejercicio13_Arrayop() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int opcion;
		int i = 0;
		int numero;
		int elementos = 0;
		int posicion = 0;

		int[] num = new int[10];

		do {

			System.out.println("que deseas hacer ");
			System.out.println("-----------------------");
			System.out.println("opcion 1 Inicializar array a -1");
			System.out.println("opcion 2 Insertar elemento");
			System.out.println("opcion 3 Borrar elemento (de su posición compactando el array)");
			System.out.println("opcion 4 Listar array");
			System.out.println("opcion 0 Salir");
			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:

				for (posicion = 0; posicion < 10; posicion++) {
					num[posicion] = -1;

					elementos = 0;
				}
				break;

			case 2:

				System.out.println("n: ");
				numero = teclado.nextInt();

				if (elementos == 0) {
					num[0] = numero;
					elementos++;

				}

				else {
					for (posicion = 0; posicion < elementos; posicion++) {

						if (num[posicion] > numero) {

						}
					}

					for (int posicionmover = elementos; posicionmover > posicion; posicionmover--) {
						num[posicionmover]--;

					}
					num[posicion] = numero;
					elementos++;

				}

				break;

			case 3:
				
				if(posicion<elementos) {

				for (int posicionmover=posicion;posicionmover<(elementos-1);posicionmover++) {
					num[posicionmover]++;
				}
				elementos--;
				}
				else {
					System.out.println("error al borrar. no se encuentra el elemento");
				}
				break;

			case 4:

				System.out.println("mostrando numero " + num[i]);
				

				break;

			case 0:

				System.exit(0);

				break;

			}
		} while (true);

	}
}
