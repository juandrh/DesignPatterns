package factoryMethod;

public class cliente {

	public static void main(String[] args) {
		
		
		CreadorDeDocumentos factoria;
		
		factoria = (Math.random() < 0.5 ? new CreadorDocumentosLaTex() : new CreadorDocumentosWord());
		
		factoria.imprimirDocumento();
		}

}
