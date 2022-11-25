
public abstract class Trabajador {

	private String nombre;
	protected Trabajador sucesor;

	public abstract void procesarPeticion(int importe);

	public Trabajador(String nombre) {
		this.nombre = nombre;
	}

	public void establecerSucesor(Trabajador sucesor) {
		this.sucesor = sucesor;
	}

	@Override
	public String toString() {
		return String.format("Soy el trabajador %s y trabajo como %s.", nombre, getClass().getSimpleName());
	}

	public String getNombre() {
		return nombre;
	}

}
