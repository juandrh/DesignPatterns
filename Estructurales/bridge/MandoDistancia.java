package bridge;

public abstract class MandoDistancia {

	// Referencia al implementador
	protected Television television;

	public MandoDistancia(Television television) {
		this.television = television;
	}

	public void encenderTelevision() {
		System.out.println(getClass().getSimpleName() + " :: Solictando encendiendo de la television "
				+ television.getClass().getSimpleName());
		this.television.encender();
	}

	public void apagarTelevision() {
		System.out.println(getClass().getSimpleName() + " :: Solictando apagando la television "
				+ television.getClass().getSimpleName());
		this.television.apagar();
	}

	public int obtenerCanalSeleccionado() {
		System.out.println(getClass().getSimpleName() + " :: Solictando el canal actual seleccionado de la television "
				+ television.getClass().getSimpleName());
		return this.television.obtenerCanalActual();
	}

	public abstract void seleccionarCanal(int numeroCanal);

}
