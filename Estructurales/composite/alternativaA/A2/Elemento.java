
public class Elemento extends Componente {
	/*
	 * No es necesario tratar los metodos anadir y eliminar: se gestionan en la
	 * superclase lanzando una excepcion en el caso de llamar a los metodos en una
	 * hoja
	 */
	public Elemento(Object atributo) {
		super(atributo);
	}

	public void mostrar() {
		System.out.println("Elemento [atributo=" + atributo + "]");
	}

}
