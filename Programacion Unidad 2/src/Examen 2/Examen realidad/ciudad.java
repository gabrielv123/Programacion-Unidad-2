package examen2;

import java.util.Objects;
import java.util.Scanner;

public class ciudad {

	private String nombre;
	private String cp;
	private int habitantes;

	public ciudad() {

		this.nombre = "";
		this.cp = "";
		this.habitantes = 0;
	}

	public ciudad(ciudad c) {

		this.nombre = c.nombre;
		this.cp = c.cp;
		this.habitantes = c.habitantes;
	}

	@Override
	public String toString() {
		return "ciudad [nombre=" + nombre + ", cp=" + cp + ", habitantes=" + habitantes + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cp, habitantes, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ciudad other = (ciudad) obj;
		return cp == other.cp && Objects.equals(habitantes, other.habitantes) && Objects.equals(nombre, other.nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}

	public ciudad(String n, String c, int h) {

		this.nombre = n;
		this.cp = c;
		this.habitantes = h;
	}

	public void leer(Scanner teclado) {

		System.out.println("dime el nombre ");
		this.nombre = teclado.nextLine();

		System.out.println("dime un cp ");
		this.cp = teclado.nextLine();

		System.out.println("dime la cantidad de habitantes ");
		this.habitantes = teclado.nextInt();

		
	}
}