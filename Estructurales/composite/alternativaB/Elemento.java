public class Elemento extends Componente {
	
	public Elemento(Object atributo) {
		super(atributo);
	}

	@Override
	public void mostrar() {
		System.out.println("Elemento [atributo=" + atributo + "]");
	}
}