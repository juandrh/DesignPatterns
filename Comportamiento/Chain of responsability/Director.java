
public class Director extends Trabajador {
	public Director(String nombre) {
		super(nombre);
	}

	@Override
	public void procesarPeticion(int importe) {
		System.out.println(super.toString());
		if (importe < 100000) {
			System.out.println(
					String.format("Su solicitud de prestamos con un importe de %s EUR ha sido aceptada.", importe));
		} else {
			System.out.println(String.format(
					"Lo siento, no estoy autorizado a aprobar prestamos por ese importe. Traspaso su solicitud a mi jefe %s",
					sucesor.getNombre()));
			sucesor.procesarPeticion(importe);
		}
	}
}