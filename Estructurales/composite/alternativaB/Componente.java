public abstract class Componente {
	
	protected Object atributo;

	public Componente(Object atributo) {
		this.atributo = atributo;
	}

	/*
	 * Las operaciones de gestión de hijos se realizan en el compuesto
	 */
	public abstract void mostrar();
}