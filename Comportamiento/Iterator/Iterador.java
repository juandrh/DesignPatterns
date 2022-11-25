package iterator;

public interface Iterador<T> {
public void primero();
public void siguiente();
public boolean haTerminado();
public T elementoActual() throws IteradorFueraDeLimitesException;
}
