


public class Cliente {

	public static void main(String[] args) {
		
		ConstructorVehiculos constructor;
		constructor = (Math.random() < 0.5 ? new ConstructorVehiculosElectricos() : new ConstructorVehiculosCombustion());
		DirectorDeConstruccion director = new DirectorDeConstruccion();		
		
		director.establecerConstructor(constructor);
		Vehiculo vehiculo = director.construirVehiculo();
		System.out.println(vehiculo);
		
		
	}
}
