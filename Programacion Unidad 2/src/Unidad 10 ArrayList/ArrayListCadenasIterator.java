package objeto2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListCadenasIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String almacenada;
		ArrayList<String> list = new ArrayList<String>();

		do {

			System.out.println("introduce una palabra");
			almacenada = teclado.nextLine();

			if (!almacenada.isEmpty()) {

				list.add(almacenada);
				System.out.println("palabra :" + almacenada + "introducida ");
			}
		} while (!almacenada.isEmpty());

		String s = "";
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			s = it.next();
			System.out.println(s);
		}

	}
}