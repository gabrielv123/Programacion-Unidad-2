package yo;

import java.util.Objects;
import java.util.Scanner;

public class contacto {

//--------------------------------------------------------------------------------declaracion de variables-----------------------------------------------------------------------------------------//

	private String nombre;
	private int telefono;
	private String dni;
	private ciudad domicilio;
	private String apellido;

//--------------------------------------------------------------------------------constructor por defecto -----------------------------------------------------------------------------------------//

	public contacto() {

		this.nombre = "";
		this.apellido = "";
		this.telefono = 0;
		this.dni = "";
		this.domicilio = new ciudad();
	}

//--------------------------------------------------------------------------------constructor copia -----------------------------------------------------------------------------------------//

	public contacto(contacto c) {

		this.nombre = c.nombre;
		this.apellido = c.apellido;
		this.telefono = c.telefono;
		this.dni = c.dni;
		this.domicilio = c.domicilio;

	}

//--------------------------------------------------------------------------------constructor personalizado -----------------------------------------------------------------------------------------//

	public contacto(String n, int t, String d, String a, ciudad ci) {

		this.nombre = n;
		this.apellido = a;
		this.telefono = t;
		this.dni = d;
		this.domicilio = ci;

	}
//--------------------------------------------------------------------------------metodos get y set -----------------------------------------------------------------------------------------//

//----------------------metodos get y set apellido --------------------------------//

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

//----------------------metodos get y set nombre --------------------------------//

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

//----------------------metodos get y set telefono --------------------------------//

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

//----------------------metodos get y set de dni --------------------------------//

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

//----------------------metodos get y set ciudad --------------------------------//

	public ciudad getCiudad() {
		return domicilio;
	}

	public void setCiudad(ciudad ciudad) {
		this.domicilio = ciudad;
	}

//--------------------------------------------------------------------------------metodo to string -----------------------------------------------------------------------------------------//

	@Override
	public String toString() {
		return "contacto [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", dni=" + dni
				+ ", ciudad=" + domicilio + "]";
	}

//--------------------------------------------------------------------------------metodo hash -----------------------------------------------------------------------------------------//

	@Override
	public int hashCode() {
		return Objects.hash(apellido, domicilio, dni, nombre, telefono);
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
		contacto other = (contacto) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(domicilio, other.domicilio)
				&& Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre) && telefono == other.telefono;
	}

//--------------------------------------------------------------------------------metodo leer -----------------------------------------------------------------------------------------//

	public void leer(Scanner teclado) {

		System.out.println("dime tu nombre ");
		this.nombre = teclado.nextLine();

		System.out.println("dime un apellido ");
		this.apellido = teclado.nextLine();
		
		System.out.println("dime un dni ");
		this.dni = teclado.nextLine();

		System.out.println("dime un telefono ");
		this.telefono = teclado.nextInt();

		teclado.nextLine();

		// llamo al metodo leer de la clase ciudad


		this.domicilio.leer(teclado);
	}
}