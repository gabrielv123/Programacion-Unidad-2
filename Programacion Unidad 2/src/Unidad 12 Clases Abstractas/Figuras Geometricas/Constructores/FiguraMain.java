package ClasesAbstracta;

public class FiguraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo c = new Circulo(0, 0, 5.5);
		System.out.println("Area del círculo " + c.area());

		Figura f = new Circulo(0, 0, 5.5);
		System.out.println("Area del círculo " + f.area());
		
		f = new Rectangulo(0, 0, 5.5, 2.0);
		System.out.println("Area del rectángulo " + f.area());
	}

}
