package objeto2;

import java.util.Scanner;
import java.util.ArrayList;

public class Arraylistcadena {

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
		} while (!almacenada.equals("")); //o while (!almacenada.isempty());

		for (int posicion=0; posicion < list.size(); posicion++)  {
			System.out.print(list.get(posicion));
		}

	}
}
