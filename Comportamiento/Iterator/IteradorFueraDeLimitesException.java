package iterator;

/**
 * Clase OperacionNoPermitida Implementa la gesti�n del error
 * 
 */

public class IteradorFueraDeLimitesException extends Exception {

	private static final long serialVersionUID = 1L;

	public IteradorFueraDeLimitesException() {
		System.out.println("\nError: IteradorFueraDeLimites.\n");
	}

}