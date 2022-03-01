package evaluacion2;

public class ejercicio17_Inicia2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] numero = new char[3][3];// creo las columna y la fila

		for (int i = 0; i < 3; i++) { // for para las filas

			for (int j = 0; j < 3; j++) { // for para las columna
				
				numero[i][j]='#'; //ponerle valor de los datos "#"

				System.out.print(numero[i][j] + "  "); // muestro el resultado

			}

			System.out.println(); // para que se muestren en fila

		}

	}
}
