package bridge;

public class MandoUniversalCompleto extends MandoDistancia {

	public MandoUniversalCompleto(Television television) {
		super(television);
	}

	@Override
	public void seleccionarCanal(int numeroCanal) {
		System.out.println(getClass().getSimpleName() + " :: Quiero seleccionar el canal " + numeroCanal
				+ " y como tengo suficientes botones y no tengo "
				+ "que ir de uno en uno ... ¡puedo hacerlo directamente!");
		television.establecerCanal(numeroCanal);
		System.out.println(getClass().getSimpleName() + " :: El canal " + numeroCanal
				+ " ha sido correctamente seleccionado en la " + "television " + television.getClass().getSimpleName());
	}

}
