
public class DirectorDeConstruccion {

	private ConstructorVehiculos constructorVehiculos;

	public DirectorDeConstruccion() {
		// TODO Auto-generated constructor stub
	}

	public void establecerConstructor(ConstructorVehiculos constructor) {
		this.constructorVehiculos = constructor;
	}

	public Vehiculo construirVehiculo() {
		constructorVehiculos.construirChasis();
		constructorVehiculos.construirMotor();
		return constructorVehiculos.obtenerResultadoConstruccion();
	}

}
