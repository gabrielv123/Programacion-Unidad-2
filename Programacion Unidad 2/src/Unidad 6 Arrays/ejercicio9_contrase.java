package evaluacion2a;

import java.util.Scanner;

public class ejercicio9_contrase {

	public ejercicio9_contrase() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre, contrasena;
		Scanner teclado = new Scanner(System.in);

		int intento = 1;

		do {

			System.out.println("introduce el nombre");

			nombre = teclado.next();

			System.out.println("introduce la contraseña");
			contrasena = teclado.next();

			if (nombre.equals("gabriel") && contrasena.equals("1234")) {

				System.out.println("bienvenido" + nombre);

				break;
			}

			else {

				System.out.println("error numero de intentos " + intento);

				intento++;

			}
		} while (intento <= 3);

		teclado.close();

	}
}