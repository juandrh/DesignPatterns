package iterator;

import java.util.List;

public class IteradorLista<T> implements Iterador<T> {
	private List<T> lista;
	private int indice;

	public IteradorLista(List<T> lista) {
		super();
		this.lista = lista;
	}

	@Override
	public void primero() {
		this.indice = 0;
	}

	@Override
	public void siguiente() {
		if (!haTerminado()) {
			indice++;
		}
	}

	@Override
	public boolean haTerminado() {
		return (indice == lista.size());
	}

	@Override
	public T elementoActual() throws IteradorFueraDeLimitesException {
		if (haTerminado()) {
			throw new IteradorFueraDeLimitesException();
		}
		return lista.get(indice);
	}
}