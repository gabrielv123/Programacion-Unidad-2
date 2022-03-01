package ejerciciosPractica;

import java.util.Scanner;

public class MATRICES_EJEMPLO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("introduce cantidad de filas");
		int cantFilas = teclado.nextInt();
		
		System.out.println("introduce cantidad de columnas");
		int cantColumnas = teclado.nextInt();
		
	
	// este for es para añadir los valores de la matriz UTILLLLLLLLL	
	int [][] matriz = new int [cantFilas][cantColumnas];
	
	for (int filas = 0; filas<matriz.length;filas++) {
		
		for (int columnas = 0; columnas<matriz[filas].length;columnas++) {
			
			System.out.println("Introduce el valor para la posicion " + filas + " " + columnas);
			matriz[filas][columnas] = teclado.nextInt();
		}
		
	}
	teclado.close();
	
	for (int columnas = 0; columnas<cantColumnas;columnas++) {
		for (int filas = 0; filas< matriz.length;filas++) {
			System.out.print(matriz[filas][columnas]);
			//arai [filas] = arai[filas] + matriz[filas][columnas]
		}
		System.out.println("");
	}

	}
	
	
}
