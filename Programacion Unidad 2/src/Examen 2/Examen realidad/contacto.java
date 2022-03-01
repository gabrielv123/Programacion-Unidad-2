package examen2;

import java.util.Objects;
import java.util.Scanner;

public class contacto extends ciudad {

	
	private String nombre;
	private String telefono;
	private int dni;
	private ciudad domicilio;
	private String apellido;

	public contacto() {

		this.nombre = "";
		this.apellido = "";
		this.telefono = "";
		this.dni = 0;
		this.domicilio = new ciudad();
	}

	public contacto(contacto c) {

		this.nombre = c.nombre;
		this.apellido = c.apellido;
		this.telefono = c.telefono;
		this.dni = c.dni;
		this.domicilio = new ciudad();

	}

	public contacto(String n, String t, int d, String a, ciudad ci) {

		this.nombre = n;
		this.apellido = a;
		this.telefono = t;
		this.dni = d;
		this.domicilio = new ciudad();

	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "contacto [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", dni=" + dni
				+ ", ciudad=" + domicilio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, domicilio, dni, nombre, telefono);
	}

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
				&& dni == other.dni && Objects.equals(nombre, other.nombre) && Objects.equals(telefono, other.telefono);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	

	public ciudad getCiudad() {
		return domicilio;
	}

	public void setCiudad(ciudad ciudad) {
		this.domicilio = ciudad;
	}

	public void leer(Scanner teclado) {

		System.out.println("dime tu nombre ");
		this.nombre = teclado.nextLine();

		System.out.println("dime un apellido ");
		this.apellido = teclado.nextLine();

		System.out.println("dime un telefono ");
		this.telefono = teclado.nextLine();

		System.out.println("dime un dni ");
		this.dni = teclado.nextInt();
		
		teclado.nextLine();

		this.domicilio.leer(teclado);
	}
}