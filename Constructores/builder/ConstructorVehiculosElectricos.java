
public class ConstructorVehiculosElectricos extends ConstructorVehiculos {

	public ConstructorVehiculosElectricos() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void construirChasis() {
		System.out.println("Construyendo el chasis 	para el vehiculo electrico ...");
		vehiculo.setChasis("CHASIS-ELECTRICO");
	}

	@Override
	public void construirMotor() {
		System.out.println("Construyendo el motor	para el vehiculo electrico ...");
		vehiculo.setMotor("MOTOR-ELECTRICO");
	}

}
