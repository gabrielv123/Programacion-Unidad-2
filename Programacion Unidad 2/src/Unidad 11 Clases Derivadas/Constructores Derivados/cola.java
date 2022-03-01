package clasepadre;

import java.util.ArrayList;

public class cola extends ArrayList<String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean añadir(String persona) {

		return this.add(persona);

	}

	public String tratar() {

		String elemento = null;

		if (!this.isEmpty()) {
			elemento = this.get(0);

			System.out.println("su entrada " + elemento);

			this.remove(0);
		}

		else {
			System.out.println("la cola esta vacia");
		}

		return elemento;
	}

}
