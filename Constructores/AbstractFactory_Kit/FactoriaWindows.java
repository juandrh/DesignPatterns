

public class FactoriaWindows implements FactoriaComponentes {

	@Override
	public Boton crearBoton() {
		return new BotonWindows();
	}

	@Override
	public CajaTexto crearCajaTexto() {
		return new CajaTextoWindows();
	}

}
