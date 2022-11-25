package mediator;

public class Cliente {

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		MediadorMensajeria mediadorMensajeria = new MediadorMensajeriaChat();
		Usuario pedro = new UsuarioConcreto("Pedro", mediadorMensajeria);
		mediadorMensajeria.anadirUsuario(pedro);

		Usuario jaime = new UsuarioConcreto("Jaime", mediadorMensajeria);
		mediadorMensajeria.anadirUsuario(jaime);

		pedro.enviarMensaje("¡Hola a todos! ¿Hay alguien por aqui?");
	}

}
