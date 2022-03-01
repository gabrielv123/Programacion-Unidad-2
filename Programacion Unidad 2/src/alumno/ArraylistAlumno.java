package alumno;

import java.util.ArrayList;

public class ArraylistAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Alumno> base = new ArrayList<>();

		Alumno A2 = new Alumno("456939309", "gabriel", "vargas ", new fecha(), "2");
		base.add(A2);

		Alumno A3 = new Alumno("45", "luis", "perez", new fecha(), "5");
		base.add(A3);

		for (int posicion = 0; posicion < base.size(); posicion++) {
			System.out.println("persona = " + base.get(posicion));
		}

	}

}
