package mediator;

public interface MediadorMensajeria {
	public void enviarMensaje(String mensaje, Usuario usuario);

	public void anadirUsuario(Usuario usuario);
}
