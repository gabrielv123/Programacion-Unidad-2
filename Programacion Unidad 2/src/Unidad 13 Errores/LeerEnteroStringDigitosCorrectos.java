package error;

import java.util.Scanner;

public class LeerEnteroStringDigitosCorrectos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String numero = "";
		String real = "";
		try {

			System.out.println("dime un string");
			numero = teclado.nextLine();

			Integer.parseInt(numero);

		}

		catch (NumberFormatException ime) {

			for (int i = 0; i < numero.length(); i++) {
				if (numero.charAt(i) >= 48 && numero.charAt(i) <= 57) {
					real = real + numero.charAt(i);

				}

			}

			System.out.println(real);

		}

	}

}
