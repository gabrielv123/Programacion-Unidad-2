package yo;

import java.util.Scanner;

public class viaje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//----------------------------------------------------- declaracion ---------------------------------------------------------------------------------------------//

		Scanner teclado = new Scanner(System.in);

		int opcion;

		do {

			System.out.println("forma 1 : ");		// 3 forma que se me ocurrieron de hacer el ejercicio basado en mi entendimiento del mismo 
			System.out.println("forma 2 : ");		// PARA SALIR PON 0
			System.out.println("forma 3 : ");

			opcion = teclado.nextInt();

			switch (opcion) {

//---------------------------------------------------- forma 1 ---------------------------------------------------------------------------------------------------//

			// en esta forma entendi que basicamente es un array de 10 y añade los valores manualmente sin necesidad de pedirle al usuario 
			
			case 1:

				Double[] viaje = new Double[10];
				Double suma = 0.0, media = 0.0;
				int pos = 0;

				viaje[0] = 100.1;
				viaje[1] = 200.2;
				viaje[2] = 300.3;										
				viaje[3] = 400.4;
				viaje[4] = 500.5;

				
				
				for (int i = 0; i < viaje.length; i++) { // este for es la base ya que recorre el array y busca cuantas posiciones tiene y lo suma 
					if (viaje[i] != null) {		// con este if elimino todos los valores vacio a la hora de sacar la media 
						suma = suma + viaje[i]; // sumo los valores del array 
						pos++; // guardo esta variable en la que suma cada vez que encuentra un valor ES IMPORTANTE PARA SACAR LA MEDIA 

					}

					media = suma / pos; //saco la media 

				}

				System.out.println(media);

				break;

//---------------------------------------------------- forma 2 ---------------------------------------------------------------------------------------------------//

				// en este caso entendi que basicamente es un array de 10 y te pide que des una opcion para añadir nuevos en dado caso que vengan mas trabajores 
				
			case 2:

				teclado.nextLine();

				Double[] viaje2 = new Double[10];
				Double suma2 = 0.0, media2 = 0.0;
				int pos2 = 0;
				int c2 = 5;
				Double numero2 = 0.0;
				boolean fin2;

				viaje2[0] = 100.1;
				viaje2[1] = 200.2;
				viaje2[2] = 300.3;
				viaje2[3] = 400.4;
				viaje2[4] = 500.5;

				do {

					System.out.println(" dime otros km");
					numero2 = teclado.nextDouble();

					if (numero2 != 0) { // con esto le doy una opcion para que pare en dado caso que no quiera añadir ninguno ya que absurdo guardar un valor de 0 km // SI NO PONGO ESTA CONDICION LA MEDIA DA MAL YA QUE GUARDA ESTE VALOR 

						fin2 = false; // este buleano sobra pero lo cree porque me gusta // realmente lo que hace el booleano es hacer que pare el bucle que se podria hacer poniendo la misma condicion en el while
						viaje2[c2] = numero2;

						c2++;
					}

					else {
						
						fin2 = true;

					}

				} while (fin2 != true && c2 < 10);

				for (int i = 0; i < viaje2.length; i++) {
					if (viaje2[i] != null) {
						suma2 = suma2 + viaje2[i];
						pos2++;

					}
					media2 = suma2 / pos2;

				}

				System.out.println(media2);

				break;

//---------------------------------------------------- forma 3 ---------------------------------------------------------------------------------------------------//		

			case 3:
				
				// en este caso es algo especial ya que es exactamente lo mismo del 2 pero esta vez eligiendo la cantidad de trabajadores a almacenar en el array 

				teclado.nextLine();

				System.out.println(" dime la cantidad de trabajadores que vinieron hoy ");
				int cantidad = teclado.nextInt(); // le doy la cantidad de memoria al array 

				Double[] viaje3 = new Double[cantidad];
				Double suma3 = 0.0, media3 = 0.0;
				int pos3 = 0;
				int c3 = 5;
				Double numero3 = 0.0;
				boolean fin3;

				viaje3[0] = 100.1;
				viaje3[1] = 200.2;
				viaje3[2] = 300.3;
				viaje3[3] = 400.4;
				viaje3[4] = 500.5;

				do {

					System.out.println(" dime otros km");
					numero3 = teclado.nextDouble();

					if (numero3 != 0) {
						viaje3[c3] = numero3;
						fin3 = false;

						c3++;
					}

					else {
						
						fin3 = true;

					}

				} while (fin3 != true && c3 < cantidad);

				for (int i = 0; i < viaje3.length; i++) {
					if (viaje3[i] != null) {
						suma3 = suma3 + viaje3[i];
						pos3++;

					}

					media3 = suma3 / pos3;

				}

				System.out.println(media3);

				break;
			}
			
//---------------------------------------------------- fin ---------------------------------------------------------------------------------------------------//		

		} while (!(opcion == 0));
	}

}
