package yo;

import java.util.Objects;
import java.util.Scanner;

public class ciudad {

//--------------------------------------------------------------------------------declaracion de variables-----------------------------------------------------------------------------------------//

	private String nombre;
	private int cp;
	private int habitantes;

//--------------------------------------------------------------------------------constructor por defecto -----------------------------------------------------------------------------------------//

	public ciudad() {

		this.nombre = "";
		this.cp = 0;
		this.habitantes = 0;
	}

//--------------------------------------------------------------------------------constructor copia -----------------------------------------------------------------------------------------//

	public ciudad(ciudad c) {

		this.nombre = c.nombre;
		this.cp = c.cp;
		this.habitantes = c.habitantes;
	}

//--------------------------------------------------------------------------------constructor personalizado -----------------------------------------------------------------------------------------//

	public ciudad(String n, int c, int h) {

		this.nombre = n;
		this.cp = c;
		this.habitantes = h;
	}
	
//--------------------------------------------------------------------------------metodos get y set -----------------------------------------------------------------------------------------//
	
	//----------------------metodos get y set nombre --------------------------------//
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//----------------------metodos get y set cp --------------------------------//

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}
	
	//----------------------metodos get y set habitantes --------------------------------//

	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}

//--------------------------------------------------------------------------------metodo to string -----------------------------------------------------------------------------------------//
	
	@Override
	public String toString() {
		return "[nombre=" + nombre + ", cp=" + cp + ", habitantes=" + habitantes + "]";
	}
	
//--------------------------------------------------------------------------------metodo hash -----------------------------------------------------------------------------------------//

	@Override
	public int hashCode() {
		return Objects.hash(cp, habitantes, nombre);
	}
	
//--------------------------------------------------------------------------------metodo equals -----------------------------------------------------------------------------------------//

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ciudad other = (ciudad) obj;
		return cp == other.cp && habitantes == other.habitantes && Objects.equals(nombre, other.nombre);
	}
	
//--------------------------------------------------------------------------------metodo leer -----------------------------------------------------------------------------------------//

	public void leer(Scanner teclado) {

		System.out.println("dime el nombre ");
		this.nombre = teclado.nextLine();

		System.out.println("dime un cp ");
		this.cp = teclado.nextInt();

		System.out.println("dime la cantidad de habitantes ");
		this.habitantes = teclado.nextInt();

	}
}