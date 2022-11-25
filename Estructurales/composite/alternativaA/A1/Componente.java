package compositeA1;

public abstract class Componente {

	protected Object atributo;

	public Componente(Object atributo) {
		this.atributo = atributo;
	}

	public abstract void anadir(Componente c) throws OperacionNoPermitida;

	public abstract void eliminar(Componente c) throws OperacionNoPermitida;

	public abstract void mostrar();

}
