package mediator;

public abstract class Usuario {
	protected String nombre;
	protected MediadorMensajeria mediadorMensajeria;

	public Usuario(String nombre, MediadorMensajeria mediadorMensajeria) {
		this.nombre = nombre;
		this.mediadorMensajeria = mediadorMensajeria;
	}

	public String getNombre() {
		return nombre;
	}

	public abstract void enviarMensaje(String mensaje);

	public abstract void recibirMensaje(String mensaje);
}