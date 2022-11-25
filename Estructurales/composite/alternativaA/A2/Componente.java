
public abstract class Componente {

	protected Object atributo;

	public Componente(Object atributo) {
		this.atributo = atributo;
	}

	// Comportamiento por defecto: excepcion
	public void anadir(Componente c) throws OperacionNoPermitida {
		throw new OperacionNoPermitida();
	}

	public void eliminar(Componente c) throws OperacionNoPermitida {
		throw new OperacionNoPermitida();
	}

	public abstract void mostrar();

}
