
import java.util.ArrayList;
import java.util.List;

public class Compuesto extends Componente {

	List<Componente> componentes;

	public Compuesto(Object atributo) {
		super(atributo);
		componentes = new ArrayList<Componente>();
	}

	/*
	 * Se hace necesaria y obligatoria la sobrescritura de los metodos Si no se hace
	 * se lanzara una excepcion (clase padre)
	 */

	@Override
	public void anadir(Componente c) {
		componentes.add(c);
	}

	@Override
	public void eliminar(Componente c) {
		componentes.remove(c);
	}

	public void mostrar() {
		System.out.println("Compuesto [atributo=" + atributo + ", componentes=[");
		for (Componente componente : componentes) {
			componente.mostrar();
		}
		System.out.println("]\n]");
	}
}
