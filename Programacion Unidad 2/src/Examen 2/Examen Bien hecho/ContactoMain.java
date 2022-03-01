package yo;

import java.util.ArrayList;
import java.util.Scanner;

public class contactoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

//--------------------------------------------------------------------------------declaracion de variables-----------------------------------------------------------------------------------------//

		boolean encontrado;
		int opcion;

//--------------------------------------------------------------------------------declaracion del array variables-----------------------------------------------------------------------------------------//

		ArrayList<contacto> base = new ArrayList<>();

//--------------------------------------------------------------------------------menu-----------------------------------------------------------------------------------------//
		do {

			System.out.println("introduce una opcion");
			System.out.println("-------------------------------------------------------------");
			System.out.println("opcion 1: añadir contacto");
			System.out.println("opcion 2: buscar contacto");
			System.out.println("opcion 3: borrar contacto");
			System.out.println("opcion 4: listar contacto");
			System.out.println("opcion 5: mostar numero de habitantes");
			System.out.println("opcion 6: Salir ");

			opcion = teclado.nextInt();

			switch (opcion) {

//--------------------------------------------------------------------------------case 1 -----------------------------------------------------------------------------------------//

			// añadir un cliente

			case 1:

				teclado.nextLine();
				
				contacto Cliente = new contacto(); // defino la variable derivado del constructor
							
				Cliente.leer(teclado); // llamo al metodor leer del constructor

				if (!base.contains(Cliente)) { // pongo la condicion para que no sea un valor repetido
					
					//AQUI HABIA UN ERROR POR LOS EQUALS DE LAS CLASES CONSTRUCTORES QUE GENERO JAVA YA QUE COMPARABA VARIABLES QUE NO ESTABAN INICIALIZADAS ASI//

					base.add(Cliente);

				}

				else {

					System.out.println("ya esta en la cuenta ");
				}

				break;
				
//--------------------------------------------------------------------------------case 2 -----------------------------------------------------------------------------------------//

				// mostrar el la posicion que se encuentra la persona en el array a base de buscar su dni 
				
			case 2:

				teclado.nextLine();

				System.out.println("dime el dni ");
				String dni = teclado.nextLine(); // declaro la variable que a buscar 
				int pos = 0;

				encontrado = false;

				for (int i = 0; i < base.size() && encontrado == false ; i++) { // for para recorrer el array
					if (base.get(i).getDni().equals(dni)) { // una vez que lo recorra una condicion que obtenga el dni de esa posicion del array y lo compare con el dni 
						encontrado = true;
						
						
					}
					
					pos = i; // inicializo esta variale para que solo muestre el mensaje de la posicion una sola vez 
				}
				

				if (encontrado) {
				
					System.out.println("la persona se encuentra en la posicion " + pos); // mostrar la posicion 
				}

				if (!encontrado) {
					
					System.out.println("la persona no esta en la cuenta ");
				}

				break;
				
//--------------------------------------------------------------------------------case 3 -----------------------------------------------------------------------------------------//
				
				// borrar usuario buscando por nombre de la persona 
				
			case 3:

				teclado.nextLine();

				System.out.println("dime el nombre de la persona ");
				String persona = teclado.nextLine();  

				int posborrar = 0;
				encontrado = false;

				for (int i = 0; i < base.size();i++) { 
					if (base.get(i).getNombre().equals(persona)) { // busca el nombre y lo compara con la persona 
						encontrado = true;

					}
					
					posborrar = i; // inicializo esta variale para que solo muestre el mensaje de borrar una sola vez 
				}	
				
				if (encontrado) {
					base.remove(posborrar); // si lo encuentra lo borra 
					System.out.println("la persona se ha borrado de la base ");
					
				}

					else {
						System.out.println("la persona no se encontro");
					}
				

				break;

//--------------------------------------------------------------------------------case 4 -----------------------------------------------------------------------------------------//
				
				//listar 
				
			case 4:

				teclado.nextLine();

				for (int i = 0; i < base.size(); i++) {
					System.out.println(base.get(i)); // un for que recorre el array y lo va mostrando lo que tiene 
				}

				break;
				
//--------------------------------------------------------------------------------case 5 -----------------------------------------------------------------------------------------//

				// decir el numero de habitantes buscando por numero de telefono 
				
			case 5:

				teclado.nextLine();

				System.out.println("dime el numero de telefono ");
				int telefono = teclado.nextInt();

				encontrado = false;
				int habitante;
				for (int i = 0; i < base.size(); i++) {
					if (base.get(i).getTelefono() == telefono) {  
						habitante = base.get(i).getCiudad().getHabitantes(); // aqui obtengo el numero de habitante y lo muestro 
						// AQUI FALTO AGARRAR EL GET CIUDAD YA QUE NO DERIVA DE UNA CLASE //
						encontrado = true;
						System.out.println(" la cantidad de habitantes son " + habitante);
					}

				}

				if (!encontrado) {
					System.out.println("el numero de telefono no esta en la lista");
				}

				break;
				
//--------------------------------------------------------------------------------case 6 -----------------------------------------------------------------------------------------//

				// salir 
				
			case 6:

				System.exit(0);

			}
			
//-------------------------------------------------------------------------------- fin -----------------------------------------------------------------------------------------//

		} while (opcion != 6);

	}
}