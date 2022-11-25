
public interface Componente {
	public void anadir(Componente c) throws OperacionNoPermitida;

	public void eliminar(Componente c) throws OperacionNoPermitida;

	public abstract void mostrar();
}
