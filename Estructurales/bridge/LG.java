package bridge;

public class LG implements Television {

	private int canalSeleccionado;
	private boolean smartTv;

	public LG() {
		this.canalSeleccionado = 0;
		this.smartTv = true;
	}

	@Override
	public void encender() {
		System.out.println(getClass().getSimpleName() + " :: Estoy en fase de encedido... ˇEncendida!");
	}

	@Override
	public void apagar() {
		System.out.println(getClass().getSimpleName() + " :: Estoy en fase de apagado ... ˇApagada!");
	}

	@Override
	public void establecerCanal(int numeroCanal) {
		System.out.println(getClass().getSimpleName() + " :: Compruebo si el SmartTV esta activo");
		if (smartTv) {
			System.out.println(getClass().getSimpleName() + " :: El SmartTV esta activo: debo desactivarlo");
			smartTv = false;
			System.out.println(getClass().getSimpleName() + " :: Desactivando el SmartTV ... ˇDesactivado!");
		}
		System.out.println(getClass().getSimpleName() + " :: Estoy seleccionando el canal " + numeroCanal + " ...");
		this.canalSeleccionado = numeroCanal;
	}

	@Override
	public int obtenerCanalActual() {
		System.out.println(getClass().getSimpleName() + " :: Estoy obteniendo el canal que actualmente tengo "
				+ "seleccionado: " + this.canalSeleccionado);
		return canalSeleccionado;
	}
}
