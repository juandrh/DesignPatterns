public class Elemento implements Componente {
	private Object atributo;

	public Elemento(Object atributo) {
		this.atributo = atributo;
	}

	public void anadir(Componente c) throws OperacionNoPermitida {
		throw new OperacionNoPermitida();
	}

	public void eliminar(Componente c) throws OperacionNoPermitida {
		throw new OperacionNoPermitida();
	}

	public void mostrar() {
		System.out.println("Elemento [atributo=" + atributo + "]");
	}
}