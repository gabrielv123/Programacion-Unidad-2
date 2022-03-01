package error;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class leerentero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
	
		try {	
		System.out.println("dime un numero");
		int numero = teclado.nextInt();
		
		System.out.println(numero);
		
		
			
	}
		
		catch (InputMismatchException ime) {
			
			System.out.println("pendejo es un entero");
	}
		
	}
}
