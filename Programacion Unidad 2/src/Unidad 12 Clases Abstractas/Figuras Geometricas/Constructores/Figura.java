package ClasesAbstracta;

public abstract class Figura {

//-----------------------------------------------------------------------defino el metodo abstracto-----------------------------------------------------------------------------//
	
	public abstract double area(); // es un metodo que basicamente solo esta definido pero no implementado

//-----------------------------------------------------------------------defino variables-----------------------------------------------------------------------------//
	
	protected int x; //defino en un plano x
	protected int y; //defino en un plano y

//-----------------------------------------------------------------------constructor vacio -----------------------------------------------------------------------------//	

	public Figura() {

		this.x = 0;
		this.y = 0;
	}
	
//-----------------------------------------------------------------------constructor copia -----------------------------------------------------------------------------//	

	public Figura(Figura f) {

		this.x = f.x;
		this.y = f.y;
	}
	
//-----------------------------------------------------------------------constructor personalizado -----------------------------------------------------------------------------//	

	public Figura(int x, int y) {

		this.x = x;
		this.y = y;
	}

}
