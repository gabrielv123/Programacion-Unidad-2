package Clases_Base;

import java.util.Scanner;

public class Asignatura implements Comparable<Persona> {

	private String descripcion;
	private String codigo;
	private double nota;

	public Asignatura() {

		this.descripcion = "";
		this.codigo = "";
		this.nota = 0.0;
	}

	// constructor copia
	public Asignatura(Asignatura f) {

		this.codigo = f.codigo;
		this.descripcion = f.descripcion;
		this.nota = f.nota;
	}

	public Asignatura(String codigo, String descripcion, double nota) {

		this.codigo = codigo;
		this.descripcion = descripcion;
		this.nota = 0.0;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota);
		result = prime * result + (int) (temp ^ (temp >>> 32));

		return result;
	}

	public boolean equals(Object obj) {

		if (this == obj)
			// si es el mismo objeto

			return true;
		if (obj == null)

			// si el objeto es nulo (no está creado)
			return false;

		if (getClass() != obj.getClass())

			// si los objetos no son de la misma clase

			return false;
		// creo un objeto temporal de esta clase
		Asignatura other = (Asignatura) obj;

		// comparo las propiedades de los objetos this y other

		if (this.codigo.equals(other.codigo) && this.nota == other.nota) {
			return true;
		}
		return false;

	}

	public int CompareTo(Asignatura other) {

		int comparacion;

		comparacion = this.codigo.compareTo(other.codigo);
		if (comparacion == 0) {
			Double n1 = this.nota;
			Double n2 = other.nota;
			comparacion = n1.compareTo(n2);
		}

		return comparacion;

	}

	public String toString() {
		return codigo + descripcion + nota;
	}

	public void leer(Scanner teclado) {

		System.out.println("codigo: ");
		this.codigo = teclado.nextLine();

		System.out.println("descripcion: ");
		this.descripcion = teclado.nextLine();

		System.out.println("nota: ");
		this.nota = teclado.nextDouble();

	}

	public int compareTo(Asignatura a3) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
