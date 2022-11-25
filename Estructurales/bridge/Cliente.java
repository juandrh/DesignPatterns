package bridge;

public class Cliente {

	public static void main(String[] args) {
		// MandoDistancia mando = new MandoUniversalSimple(new Samsung());
		// MandoDistancia mando = new MandoUniversalCompleto(new Samsung());
		// MandoDistancia mando = new MandoUniversalCompleto(new LG());
		MandoDistancia mando = new MandoUniversalSimple(new LG());
		mando.encenderTelevision();
		mando.seleccionarCanal(7);
		mando.seleccionarCanal(2);
		mando.apagarTelevision();
	}

}
