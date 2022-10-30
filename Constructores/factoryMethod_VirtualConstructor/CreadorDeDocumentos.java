package factoryMethod;

public abstract class CreadorDeDocumentos {

	public CreadorDeDocumentos() {
		// TODO Auto-generated constructor stub
	}
	public abstract Documento crearDocumento();
	public void imprimirDocumento() {
	Documento documento = crearDocumento();
	documento.imprimir();
	}
}
