package clasesabstracta;

import java.util.ArrayList;

public class ArrayListFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Figura> base = new ArrayList<>();
		
		Figura c = new Circulo(0, 0, 5.5);
		base.add(c);
		
		Figura r = new Rectangulo(0, 0, 5.5, 2.0);
		base.add(r);
		
		Figura t = new Triangulo(0, 0, 5.5, 2.0);
		base.add(t);
		
		Figura c1 = new Cuadrado(0, 0, 5.5);
		base.add(c1);

		for (int posicion = 0; posicion < base.size(); posicion++) {
			System.out.println("Área = " + base.get(posicion).area());
		}

	}

}
