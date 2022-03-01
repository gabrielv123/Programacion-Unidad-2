package evaluacion2a;

public class ejercicio16_fusionar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] palabra1 = { "a", "b", "c", "df", "e", "i" };
		String[] palabra2 = { "1", "2", "3", "4", "5", "6" };
		String[] palabra3 = new String[20];

		int elementos1 = palabra1.length;
		int elementos2 = palabra2.length;
		int elementos3 = 0;

		// sacar el primer array
		System.out.println("array 1 ");

		for (int posicion1 = 0; posicion1 < elementos1; posicion1++) {
			System.out.println(palabra1[posicion1]);
		}

		// sacar el segundo array
		System.out.println("array 2 ");

		for (int posicion2 = 0; posicion2 < elementos2; posicion2++) {
			System.out.println(palabra2[posicion2]);
		}

		int posicion1 = 0; // resetear la posicion
		int posicion2 = 0;
		int posicion3 = 0;

		// comparar hasta llegar el final de los array
		while (posicion1 < elementos1 && posicion2 < elementos2) {
			if (palabra1[posicion1].compareTo(palabra2[posicion2]) < 0) {

				palabra3[elementos3] = palabra1[posicion1];
				posicion1++;
			} else {
				palabra3[elementos3] = palabra2[posicion2];
				posicion2++;
			}
			elementos3++;
		}
		if (posicion1 < elementos1) {
			while (posicion1<elementos1) {
			palabra3[elementos3] = palabra1[posicion1];
			posicion1++;
			elementos3++;

		}
	}
		
		if (posicion2 < elementos2) {
			while (posicion2<elementos2) {
			palabra3[elementos3] = palabra2[posicion2];
			posicion2++;
			elementos3++;

		}
	}
		
		System.out.println("resultado: " +elementos3);
		for (posicion3=0;posicion3<elementos3;posicion3++) {
			System.out.println(palabra3[posicion3]);
		}
	

}}
