
public abstract class ConstructorVehiculos {

	protected Vehiculo vehiculo;

	public ConstructorVehiculos() {
		vehiculo = new Vehiculo();
	}

	public Vehiculo obtenerResultadoConstruccion() {
		return vehiculo;
	}

	public abstract void construirChasis();

	public abstract void construirMotor();

}
