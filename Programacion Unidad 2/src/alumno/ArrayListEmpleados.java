package alumno;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Empleado> base = new ArrayList<>();
		
		
		String respuesta;

		do {
			
			Empleado a�adir = new Empleado(); // lo declaro dentro porque o sino suscribe lo que tengo guardado
			
			a�adir.leer(teclado);
			
			base.add(a�adir);
			
			teclado.nextLine();
			
			System.out.println("deseas continuar en el programa");
		    respuesta = teclado.nextLine();
			
			

		}while(respuesta.equals("si"));
		
		for (int posicion = 0; posicion < base.size(); posicion++) {
			System.out.println("persona = " + base.get(posicion));
		}
	

	}

}
