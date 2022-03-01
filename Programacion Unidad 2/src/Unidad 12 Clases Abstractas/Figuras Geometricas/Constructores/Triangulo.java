package ClasesAbstracta;

import java.util.Objects;

public class Triangulo extends Figura {

//-----------------------------------------------------------------------defino variables-----------------------------------------------------------------------------//	
	
	protected double base;
	protected double altura;

//-----------------------------------------------------------------------constructor vacio -----------------------------------------------------------------------------//	
	
	public Triangulo() {
		
		super();
		this.base = 1.0;
		this.altura = 1.0;
	
	}
	
//-----------------------------------------------------------------------constructor copia -----------------------------------------------------------------------------//	
	
	public Triangulo(Triangulo t) {
		
		this.base = t.base;
		this.altura =t.altura;
		
	}
	
//-----------------------------------------------------------------------constructor personalizado -----------------------------------------------------------------------------//	

	public Triangulo(int x, int y, double base, double altura) {
		super(x, y);
		this.base = base;
		this.altura = altura;
	}
	
//-----------------------------------------------------------------------metodo area---------------------------------------------------------------------------------------------//

	public double area() {
		return ((base * altura) / 2);
	}
	
//-----------------------------------------------------------------------metodo perimetro---------------------------------------------------------------------------------------------//
	
	public double perimetro() {

		Double base_elevado = Math.pow(this.base, 2); //elevo al cuadrado la base de un triangulo
		Double altura_elevado = Math.pow(this.altura, 2); // elevo al cuadrado la altura de un triangulo

		double hipotenusa = Math.sqrt(altura_elevado + base_elevado); // para sacar el perimetro necesitamos la hipotenusa de un triangulo que se saca sacando la raiz cuadrada de la altura al cubo mas la base al cubo del triangulo
		
		return this.base + this.altura + hipotenusa; // para sacar el perimetro es la suma de la base, la altura y la hipotenusa 
	}
	
//-----------------------------------------------------------------------metodo to string---------------------------------------------------------------------------------------------//

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}
	
//-----------------------------------------------------------------------metodo get y set---------------------------------------------------------------------------------------------//

//--------------------- get y set de base---------------------------//	
	
		public double getBase() {
			return base;
		}

		public void setBase(double base) {
			this.base = base;
		}
		
//--------------------- get y set de altura ---------------------------//

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}

//-----------------------------------------------------------------------metodo hash---------------------------------------------------------------------------------------------//
	
	@Override
	public int hashCode() {
		return Objects.hash(altura, base);
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
		Triangulo other = (Triangulo) obj;
		return Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura)
				&& Double.doubleToLongBits(base) == Double.doubleToLongBits(other.base);
	}
	
	
}