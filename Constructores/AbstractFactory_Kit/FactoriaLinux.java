

public class FactoriaLinux implements FactoriaComponentes {

	@Override
	public Boton crearBoton() {
		return new BotonLinux();
	}

	@Override
	public CajaTexto crearCajaTexto() {
		return new CajaTextoLinux();
	}

}
