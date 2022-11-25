package compositeA1;

public class Cliente {

	public static void main(String[] args) {
		Componente carpetaRaiz = new Compuesto("CarpetaRaiz");
		Componente fichero1 = new Elemento("Fichero1");
		Componente fichero2 = new Elemento("Fichero2");
		try {
			carpetaRaiz.anadir(fichero1);
			fichero1.anadir(fichero2); // No permitido (excepcion)
		} catch (OperacionNoPermitida e) {
			e.printStackTrace();
		} finally {
			carpetaRaiz.mostrar();
		}

	}

}
