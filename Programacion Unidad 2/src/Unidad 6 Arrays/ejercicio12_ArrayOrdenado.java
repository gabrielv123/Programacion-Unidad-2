package evaluacion2a;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio12_ArrayOrdenado {

	public ejercicio12_ArrayOrdenado() {
		// TODO Auto-generated constructor stub
	}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int numero , posicion;
			
			Scanner teclado = new Scanner(System.in);
			
			int[] num = new int[10];
			
			int contador = 0;
			
			do {
				
				System.out.println("numero :");
				numero = teclado.nextInt();
				
				if (numero >= 0) {
					num[contador] =numero;
				} else {
					break;
				}
				
				contador++;
			
			}while (contador<=10);	
			
			teclado.close();
			
			Arrays.sort(num);
			
			for (int i=0; i<num.length; i++) {
				
				System.out.println("ordenados " +i+ ": " +num[i]);
			}
			
			
			
			
			
			
	}

}
