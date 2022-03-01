package clasesabstracta;

public class FiguraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// personalizados

		Circulo c = new Circulo(0, 0, 5.5);
		System.out.println("Area del círculo " + c.area());
		System.out.println("Area del círculo " + c.perimetro());

		Rectangulo r = new Rectangulo(0, 0, 5.5, 2.0);
		System.out.println("Area del rectángulo " + r.area());
		System.out.println("Area del rectángulo " + r.perimetro());

		Triangulo t = new Triangulo(0, 0, 5.5, 2.0);
		System.out.println("Area del Triangulo " + t.area());
		System.out.println("Area del Triangulo " + t.perimetro());

		Cuadrado c1 = new Cuadrado(0, 0, 5.5);
		System.out.println("Area del Cuadrado " + c1.area());
		System.out.println("Area del Cuadrado " + c1.perimetro());

		// por defecto

		Rectangulo r1 = new Rectangulo();
		System.out.println(r1);

		Triangulo t1 = new Triangulo();
		System.out.println(t1);

		Circulo c11 = new Circulo();
		System.out.println(c11);

		Cuadrado cu = new Cuadrado();
		System.out.println(cu);

		// equals

		Circulo c3 = new Circulo(0, 0, 5.5);
		Circulo c4 = new Circulo(0, 0, 5.5);

		if (c3.equals(c4)) {
			System.out.println("son iguales");
		}

		else {

			System.out.println("no son iguales");
		}

		Triangulo t3 = new Triangulo(0, 0, 5.5, 0.2);
		Triangulo t4 = new Triangulo(0, 0, 5.5, 0.3);

		if (t3.equals(t4)) {
			System.out.println("son iguales");
		}

		else {

			System.out.println("no son iguales");
		}

		Rectangulo r3 = new Rectangulo(0, 0, 5.5, 0.2);
		Rectangulo r4 = new Rectangulo(0, 0, 5.5, 0.3);

		if (r3.equals(r4)) {
			System.out.println("son iguales");
		}

		else {

			System.out.println("no son iguales");
		}

		Cuadrado co3 = new Cuadrado(0, 0, 3);
		Cuadrado co4 = new Cuadrado(0, 0, 3);

		if (co3.equals(co4)) {
			System.out.println("son iguales");
		}

		else {

			System.out.println("no son iguales");
		}

		if (c3.compareTo(c4) > 0) {
			System.out.println("es mayor");
		}

		if (c3.compareTo(c4) < 0) {
			System.out.println("es menor");
		}

		else {
			System.out.println("es igual");
		}

		if (t3.equals(t4)) {
			System.out.println("son iguales");
		}

		else {

			System.out.println("no son iguales");
		}

		if (t3.compareTo(t4) > 0) {
			System.out.println("es mayor");
		}

		if (t3.compareTo(t4) < 0) {
			System.out.println("es menor");
		}

		else {
			System.out.println("es igual");
		}

	}

}