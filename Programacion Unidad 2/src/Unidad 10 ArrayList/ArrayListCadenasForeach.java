package objeto2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCadenasForeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String almacenada;
		ArrayList<String> list = new ArrayList<String>();

		do {

			System.out.println("introduce una palabra");
			almacenada = teclado.nextLine();

			if (!almacenada.equals("")) {

				list.add(almacenada);
				System.out.println("palabra :" + almacenada + "introducida ");
			}
		} while (!almacenada.equals(""));

		for(String cadena : list) {
			System.out.print(cadena);
		}

	}
}
