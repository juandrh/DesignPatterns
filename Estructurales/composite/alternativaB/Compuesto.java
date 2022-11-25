
import java.util.ArrayList;
import java.util.List;

public class Compuesto extends Componente {

	List<Componente> componentes;

	public Compuesto(Object atributo) {
		super(atributo);
		componentes = new ArrayList<Componente>();
	}

	public void anadir(Componente c) {
		componentes.add(c);
	}

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