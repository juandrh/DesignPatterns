
public class Cliente {

	public static void main(String[] args) {
		
		Trabajador pedro = new Cajero("Pedro");
		Trabajador carmen = new Gerente("Carmen");
		Trabajador luis = new Director("Luis");
		// Definicion de la cadena
		pedro.establecerSucesor(carmen);
		carmen.establecerSucesor(luis);
		// Solictud de un prestamo de 500 a Pedro y a Carmen
		pedro.procesarPeticion(12000);

	}

}
