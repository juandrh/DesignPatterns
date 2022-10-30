
public class ConstructorVehiculosCombustion extends ConstructorVehiculos {

	public ConstructorVehiculosCombustion() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void construirChasis() {
		System.out.println("Construyendo el chasis 	para el vehiculo combustion ...");
		vehiculo.setChasis("CHASIS-COMBUSTION");
	}

	@Override
	public void construirMotor() {
		System.out.println("Construyendo el motor	para el vehiculo combustion ...");
		vehiculo.setMotor("MOTOR-COMBUSTION");
	}

}
