package ClasesAbstracta;

public class Cuadrado extends Rectangulo {

//-----------------------------------------------------------------------constructor vacio -----------------------------------------------------------------------------//	
	
	public Cuadrado() {
		super();
	}
	
//-----------------------------------------------------------------------constructor copia -----------------------------------------------------------------------------//	

	public Cuadrado(Cuadrado c) {

		super(c);
	}
	
//-----------------------------------------------------------------------constructor personalizado -----------------------------------------------------------------------------//	

	public Cuadrado(int x, int y, double lado) {
		super(x, y, lado, lado);
	}

}
