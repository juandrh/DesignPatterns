package mediator;

public class UsuarioConcreto extends Usuario {
	public UsuarioConcreto(String nombre, MediadorMensajeria mediadorMensajeria) {
		super(nombre, mediadorMensajeria);
	}

	@Override
	public void enviarMensaje(String mensaje) {
		System.out.println(
				String.format("(El usuario %s ha ENVIADO un mensaje)%s dice :: >> %s", nombre, nombre, mensaje));
		mediadorMensajeria.enviarMensaje(mensaje, this);
	}

	@Override
	public void recibirMensaje(String mensaje) {
		System.out.println(
				String.format("(El usuario %s ha RECIBIDO un mensaje)%s ha leido :: %s", nombre, nombre, mensaje));
	}
}