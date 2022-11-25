package iterator;

public interface AgregadoEstudiantes {
	public void anadirEstudiante(Estudiante estudiante);

	public void eliminarEstudiante(Estudiante estudiante);

	public Iterador<Estudiante> crearIterador();
}
