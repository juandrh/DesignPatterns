package iterator;

import java.util.ArrayList;
import java.util.List;

public class ListadoEstudiantes implements AgregadoEstudiantes {
	private List<Estudiante> lista;

	public ListadoEstudiantes() {
		this.lista = new ArrayList<Estudiante>();
	}

	@Override
	public void anadirEstudiante(Estudiante estudiante) {
		lista.add(estudiante);
	}

	@Override
	public void eliminarEstudiante(Estudiante estudiante) {
		lista.remove(estudiante);
	}

	@Override
	public Iterador<Estudiante> crearIterador() {
		return new IteradorLista<Estudiante>(lista);
	}
}