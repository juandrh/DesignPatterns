package mediator;

import java.util.ArrayList;
import java.util.List;

public class MediadorMensajeriaChat implements MediadorMensajeria {
	private List<Usuario> usuarios;

	public MediadorMensajeriaChat() {
		this.usuarios = new ArrayList<Usuario>();
	}

	public void anadirUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
		System.out.println(String.format(
				"(MediadorMensajeriaChat :: %s acaba de entrar al Chat.En total hay %s usuarios en la sala)",
				usuario.getNombre(), usuarios.size()));
	}

	public void enviarMensaje(String mensaje, Usuario usuario) {
		for (Usuario u : usuarios) {
			if (!u.equals(usuario)) {
				u.recibirMensaje(mensaje);
			}
		}
	}
}