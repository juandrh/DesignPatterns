package bridge;

public class MandoUniversalSimple extends MandoDistancia {

	public MandoUniversalSimple(Television television) {
		super(television);
	}

	@Override
	public void seleccionarCanal(int numeroCanal) {
		System.out.println(getClass().getSimpleName() + " :: Quiero seleccionar el canal " + numeroCanal
				+ ", pero solamente puedo ir de uno en uno ...");
		int numeroCanalActual = television.obtenerCanalActual();
		if (numeroCanalActual > numeroCanal) {
			System.out.println(getClass().getSimpleName() + " :: Voy a ir solicitando la SUBIDA de uno en "
					+ "uno hasta que llegue al canal deseado");
			while (numeroCanalActual > numeroCanal) {
				television.establecerCanal(--numeroCanalActual);
			}
		} else {
			System.out.println(getClass().getSimpleName() + " :: Voy a ir solicitando la BAJADA de uno en "
					+ "uno hasta que llegue al canal deseado");
			while (numeroCanalActual < numeroCanal) {
				television.establecerCanal(++numeroCanalActual);
			}
		}
		System.out.println(getClass().getSimpleName() + " :: El canal " + numeroCanal
				+ " ha sido correctamente seleccionado en la television " + television.getClass().getSimpleName());
	}
}
