package Clases_Base;

import java.util.Objects;
import java.util.Scanner;

public class racional implements Comparable<racional> {

	private int numerador;
	private int denominador;

	public racional() {
		this.numerador = 0;
		this.denominador = 1;

	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {

		if (!(denominador == 0)) {
			this.denominador = denominador;
		} else {
			this.denominador = 1;
		}

	}

	public racional(racional r) {
		this.numerador = r.numerador;
		this.denominador = r.denominador;
	}

	public racional(int numerador) {
		this.numerador = numerador;
		this.denominador = 1;

	}

	public racional(int numerador, int denominador) {
		this.numerador = numerador;
		if (!(denominador == 0)) {
			this.denominador = denominador;
		} else {
			System.out.println("el denominador no puede ser 0, por que el resultado daria infinito. "
					+ "Por lo tanto se a puesto 1");

			this.denominador = 1;

		}

	}

	public void leer(Scanner teclado) {

		System.out.println("introduce el numerador");
		this.numerador = teclado.nextInt();

		System.out.println("introduce el denominador");
		int denomi = teclado.nextInt();

		while (denomi == 0) {
			System.out.println("el denominador no puede ser 0");
			System.out.println("denominador");
			denomi = teclado.nextInt();
		}
		
		this.denominador = denomi;
	}


	public void escribir() {
		System.out.println(numerador + " / " + denominador);
	}

	@Override
	public String toString() {
		return numerador + " / " + denominador;
	}

	@Override
	public int hashCode() {
		return Objects.hash(denominador, numerador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		racional other = (racional) obj;
		return denominador == other.denominador && numerador == other.numerador;
	}

	public void finalize() {
		System.out.println("se a destruido el racional");
	}

	@Override
	public int compareTo(racional o) {
		// TODO Auto-generated method stub
		return 0;
	}
}