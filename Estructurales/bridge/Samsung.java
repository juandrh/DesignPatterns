package bridge;

public class Samsung implements Television {

	private int canalSeleccionado;

	public Samsung() {
		this.canalSeleccionado = 1;
	}

	@Override
	public void encender() {
		System.out.println(getClass().getSimpleName() + " :: Estoy en fase de encedido ... ¡Encendida!");
	}

	@Override
	public void apagar() {
		System.out.println(getClass().getSimpleName() + " :: Estoy en fase de apagado ... ¡Apagada!");
	}

	@Override
	public void establecerCanal(int numeroCanal) {
		System.out.println(getClass().getSimpleName() + " :: Estoy seleccionando el canal " + numeroCanal + " ...");
		this.canalSeleccionado = numeroCanal;
	}

	@Override
	public int obtenerCanalActual() {
		System.out.println(getClass().getSimpleName()
				+ " :: Estoy obteniendo el canal que actualmente tengo seleccionado: " + this.canalSeleccionado);
		return canalSeleccionado;
	}

}
