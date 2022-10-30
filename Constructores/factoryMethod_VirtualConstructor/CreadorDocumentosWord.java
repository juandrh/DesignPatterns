package factoryMethod;

public class CreadorDocumentosWord extends CreadorDeDocumentos {
	@Override
	public Documento crearDocumento() {
	System.out.println("Creando el documento Word ...");
	return new Word();
	}
	}