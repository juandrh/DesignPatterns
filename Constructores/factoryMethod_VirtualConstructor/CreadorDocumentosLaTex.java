package factoryMethod;

public class CreadorDocumentosLaTex extends CreadorDeDocumentos {
	@Override
	public Documento crearDocumento() {
	System.out.println("Creando el documento LaTex ...");
	return new LaTex();
	}
	}