package factoryMethod;

public class Word implements Documento {
	@Override
	public void imprimir() {
		System.out.println("Imprimiendo el documento Word ...");
	}
}