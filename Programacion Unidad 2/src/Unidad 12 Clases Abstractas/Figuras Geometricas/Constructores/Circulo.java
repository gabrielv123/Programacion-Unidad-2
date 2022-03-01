package ClasesAbstracta;

import java.util.Objects;

public class Circulo extends Figura {

//-----------------------------------------------------------------------defino variables-----------------------------------------------------------------------------//
	
	protected double radio; // defino el radio del un circulo

//-----------------------------------------------------------------------constructor vacio -----------------------------------------------------------------------------//	
	
	public Circulo() {
		super();
		this.radio = 1.0;
	}
	
//-----------------------------------------------------------------------constructor copia -----------------------------------------------------------------------------//	

	public Circulo(Circulo c) {
		super(c);
		this.radio = c.radio;
	}
	
//-----------------------------------------------------------------------constructor personalizado -----------------------------------------------------------------------------//	

	public Circulo(int x, int y, double radio) {
		super(x, y);
		this.radio = radio;
	}
	
//-----------------------------------------------------------------------metodo area---------------------------------------------------------------------------------------------//

	public double area() { // para crear el area donde multiplicamos pi que vale 3.14 y el radio al cuadrado
		return (Math.PI * radio * radio); // podria poner  Math.pow para elevarlo al cuadrado o multiplicarlo 2 veces el radio
	}
	
//-----------------------------------------------------------------------metodo perimetro---------------------------------------------------------------------------------------------//

	public double perimetro() { // para calcular el perimetro de un circulo 
		return (2 * Math.PI * radio); //multiplicar los lado de un circulo que vale 2 por PI y por su radio
	}
	
//-----------------------------------------------------------------------metodo to string---------------------------------------------------------------------------------------------//

		@Override
		public String toString() {
			return "Circulo [radio=" + radio + "]";
		}
		
//-----------------------------------------------------------------------metodo get y set---------------------------------------------------------------------------------------------//

		public double getRadio() {
			return radio;
		}

		public void setRadio(double radio) {
			this.radio = radio;
		}
	
//-----------------------------------------------------------------------metodo hash---------------------------------------------------------------------------------------------//
	
	@Override
	public int hashCode() {
		return Objects.hash(radio);
	}
	
//-----------------------------------------------------------------------metodo equals---------------------------------------------------------------------------------------------//

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
	}
	

	


	
}
