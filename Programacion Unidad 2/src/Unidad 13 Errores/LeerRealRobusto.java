package error;

import java.util.Scanner;

public class LeerRealRobusto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String numero = "";
		String real = "";
		try {

			System.out.println("dime un string");
			numero = teclado.nextLine();

			Double.parseDouble(numero);

		}

		catch (NumberFormatException ime) {

			boolean comprobador = false;

			for (int i = 0; i < numero.length(); i++) {
				if (numero.charAt(i) >= 48 && numero.charAt(i) <= 57) {
					real = real + numero.charAt(i);
				} 
				
				else if (numero.charAt(i) == ',' && !comprobador) {

					if (i == 0) {
						real = "0";
					}
					real = real + ".";
					comprobador = true;
					
					

				}

			}

			System.out.println(real);

		}

	}

}

/* 

if ( real.length() > 0) {

numero = Double.parseDouble(real);
} 

*/