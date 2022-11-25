package compositeA1;

public class Elemento extends Componente {

	public Elemento(Object atributo) {
		super(atributo);
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
