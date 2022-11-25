package adapter;

public class Adaptador implements Objetivo {
	private Adaptado adaptado;

	public Adaptador() {
		adaptado = new Adaptado();
	}

	@Override
	public void solicitud() {
		System.out.println("Delegando en el objeto a adaptar la solicitud del cliente ...");
		adaptado.solicitudEspecifica();
	}
}
