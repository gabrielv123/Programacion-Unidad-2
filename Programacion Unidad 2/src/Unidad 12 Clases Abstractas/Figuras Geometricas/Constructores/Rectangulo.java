package ClasesAbstracta;

import java.util.Objects;

public class Rectangulo extends Figura {

//-----------------------------------------------------------------------defino variables-----------------------------------------------------------------------------//	

	protected double ancho;
	protected double alto;
	
//-----------------------------------------------------------------------constructor vacio -----------------------------------------------------------------------------//	

	public Rectangulo() {

		super();
		this.ancho = 1.0;
		this.alto = 1.0;
	}
	
//-----------------------------------------------------------------------constructor copia -----------------------------------------------------------------------------//	

	public Rectangulo(Rectangulo r) {

		super(r);
		this.ancho = r.ancho;
		this.alto = r.alto;
	}
	
//-----------------------------------------------------------------------constructor personalizado -----------------------------------------------------------------------------//	

	public Rectangulo(int x, int y, double ancho, double alto) {
		super(x, y);
		this.ancho = ancho;
		this.alto = alto;
	}
	
//-----------------------------------------------------------------------metodo area---------------------------------------------------------------------------------------------//

	public double area() { // para calcular el area
		return ancho * alto; // multiplicamos el ancho de un rectangulo por el alto 
	}
	
//-----------------------------------------------------------------------metodo perimetro---------------------------------------------------------------------------------------------//

	public double perimetro() {

		return (2 * this.ancho * 2 * this.alto); // para calcular el perimetro es calcular los 2 lados del ancho por los otros dos lado del alto
	}
	
//-----------------------------------------------------------------------metodo to string---------------------------------------------------------------------------------------------//

	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}
	
//-----------------------------------------------------------------------metodo get y set---------------------------------------------------------------------------------------------//

//--------------------- get y set del ancho ---------------------------//	
	
	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	
//--------------------- get y set del alto ---------------------------//	

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}
	
//-----------------------------------------------------------------------metodo hash---------------------------------------------------------------------------------------------//

	@Override
	public int hashCode() {
		return Objects.hash(alto, ancho);
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
		Rectangulo other = (Rectangulo) obj;
		return Double.doubleToLongBits(alto) == Double.doubleToLongBits(other.alto)
				&& Double.doubleToLongBits(ancho) == Double.doubleToLongBits(other.ancho);
	}

}
