package error;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeerEnteroString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		try {

			System.out.println("dime un string");
			String numero = teclado.nextLine();

			Integer.parseInt(numero);

			System.out.println(numero);

		}

		catch (NumberFormatException ime) {

			System.out.println("pendejo no puede hacerlo");
		}

	}

}
