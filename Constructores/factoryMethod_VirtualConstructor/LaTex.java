package factoryMethod;

public class LaTex implements Documento {
	@Override
	public void imprimir() {
		System.out.println("Imprimiendo el documento LaTex ...");
	}
}