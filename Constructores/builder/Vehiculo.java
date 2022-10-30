
public class Vehiculo {
	String chasis;
	String motor;
	
	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vehiculo [chasis=" + chasis + ", motor=" + motor + "]";
	}

}
