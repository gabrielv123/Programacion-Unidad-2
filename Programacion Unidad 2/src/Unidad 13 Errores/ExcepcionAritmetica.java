package error;

import java.util.Scanner;

public class ExcepcionAritmetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		double division = 0;
		int n;

		System.out.println("dime un numero 1");
		n = teclado.nextInt();
		try {

			division = n / 0;

		}

		catch (ArithmeticException im) {

			if (n > 0) {

				division = Double.POSITIVE_INFINITY;
			}

			else if (n < 0) {

				division = Double.NEGATIVE_INFINITY;
			}

			else {

				division = Double.NaN;
			}
			
			System.out.println(division);

		}

	}

}

//ArithmeticException