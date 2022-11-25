package iterator;

public class Cliente {

	public static void main(String[] args) throws IteradorFueraDeLimitesException {
		ListadoEstudiantes estudiantes = new ListadoEstudiantes();
		estudiantes.anadirEstudiante(new Estudiante("Pedro", "Campos", 35));
		estudiantes.anadirEstudiante(new Estudiante("Ana", "Saez", 52));
		estudiantes.anadirEstudiante(new Estudiante("Sara", "Perez", 35));
		Iterador<Estudiante> iterador = estudiantes.crearIterador();
		iterador.primero();
		while (iterador.haTerminado() == false) {
			System.out.println(iterador.elementoActual());
			iterador.siguiente();
		}

	}

}
