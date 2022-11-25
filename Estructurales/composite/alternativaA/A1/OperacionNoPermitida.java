package compositeA1;

/**
 * Clase OperacionNoPermitida Implementa la gestión del error
 * 
 */

public class OperacionNoPermitida extends Exception {

	private static final long serialVersionUID = 1L;

	public OperacionNoPermitida() {
		System.out.println("\nError: operacion no permitida.\n");
	}

}