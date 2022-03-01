package alumno;

import java.util.Objects;

public abstract class Vehiculo {

	protected String Nombre_vehiculo;
	protected int Potencia_motor;
	protected int Velocidad_maxima;

	public Vehiculo() {

		Nombre_vehiculo = "";
		Potencia_motor = 0;
		Velocidad_maxima = 0;
	}

	public Vehiculo(Vehiculo v) {

		Nombre_vehiculo = v.Nombre_vehiculo;
		Potencia_motor = v.Potencia_motor;
		Velocidad_maxima = v.Velocidad_maxima;
	}

	public Vehiculo(String n, int p, int v) {

		Nombre_vehiculo = n;
		Potencia_motor = p;
		Velocidad_maxima = v;

	}

	public String getNombre_vehiculo() {
		return Nombre_vehiculo;
	}

	public void setNombre_vehiculo(String nombre_vehiculo) {
		Nombre_vehiculo = nombre_vehiculo;
	}

	public int getPotencia_motor() {
		return Potencia_motor;
	}

	public void setPotencia_motor(int potencia_motor) {
		Potencia_motor = potencia_motor;
	}

	public int getVelocidad_maxima() {
		return Velocidad_maxima;
	}

	public void setVelocidad_maxima(int velocidad_maxima) {
		Velocidad_maxima = velocidad_maxima;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Nombre_vehiculo, Potencia_motor, Velocidad_maxima);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(Nombre_vehiculo, other.Nombre_vehiculo) && Potencia_motor == other.Potencia_motor
				&& Velocidad_maxima == other.Velocidad_maxima;
	}

	@Override
	public String toString() {
		return "Vehiculo [Nombre_vehiculo=" + Nombre_vehiculo + ", Potencia_motor=" + Potencia_motor
				+ ", Velocidad_maxima=" + Velocidad_maxima + "]";
	}
	
	public abstract void Desplazamiento();
	
	public abstract void finDesplazamiento();

}
