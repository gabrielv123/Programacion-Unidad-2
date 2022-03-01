package alumno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListAlumnosOrdenadoGrupo {

	public ArrayListAlumnosOrdenadoGrupo() {
		// TODO Auto-generated constructor stub

		ArrayList<Alumno> base = new ArrayList<>();

		Alumno A2 = new Alumno("456939309", "gabriel", "vargas ", new fecha(), "2");
		base.add(A2);

		Alumno A3 = new Alumno("45", "luis", "perez", new fecha(), "5");
		base.add(A3);

		Collections.sort(base, new Comparator<Alumno>() {
		
	public int compare(Alumno A2 , Alumno A3) {
			
			String g1 = A2.getGrupo();
			String g2 = A3.getGrupo();
			
		int	comparacion = g1.compareTo(g2);
			
			if (comparacion == 0) {
				Persona p1 = new Persona(A2);
				Persona p3 = new Persona(A3);
				comparacion = p1.CompareTo(p3);
			}
			
			return (comparacion);
	
	}
		});
		
		for (int posicion = 0; posicion < base.size(); posicion++) {
			System.out.println("persona = " + base.get(posicion));
		}
		
	
	}

	}


