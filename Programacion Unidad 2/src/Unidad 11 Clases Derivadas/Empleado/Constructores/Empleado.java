package Clases_Base;

import java.util.Objects;
import java.util.Scanner;

public class Empleado extends Persona {

	private String departamento;
	private String puesto;
	private Double Salario;

	public Empleado() {

		super();
		this.departamento = "";
		this.puesto = "";
		this.Salario = 0.0;
	}

	public Empleado(Empleado e) {

		super(e);
		this.departamento = e.departamento;
		this.puesto = e.puesto;
		this.Salario = e.Salario;
	}

	public Empleado(String de, String p, Double s) {

		this.departamento = de;
		this.puesto = p;
		this.Salario = s;
	}

	public Empleado(String d, String n, String a, fecha f, String de, String p, Double s) {

		super(d, n, a, f);
		this.departamento = de;
		this.puesto = p;
		this.Salario = s;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salario) {
		Salario = salario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Salario, departamento, puesto);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(Salario, other.Salario) && Objects.equals(departamento, other.departamento)
				&& Objects.equals(puesto, other.puesto);
	}

	@Override
	public String toString() {
		return super.toString() + "Empleado [departamento=" + departamento + ", puesto=" + puesto + ", Salario="
				+ Salario + "]";
	}

	public void leer(Scanner teclado) {

		super.leer(teclado);

		teclado.nextLine();

		System.out.println("departamento");
		this.departamento = teclado.nextLine();

		System.out.println("puesto");
		this.puesto = teclado.nextLine();

		System.out.println("salario");
		this.Salario = teclado.nextDouble();
	}

}
