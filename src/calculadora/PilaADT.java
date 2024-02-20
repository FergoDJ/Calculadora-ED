package calculadora;

/**
 * Interfaz PilaADT: Define los métodos básicos para una pila genérica.
 * @param <T> El tipo de datos que se almacenará en la pila.
 */
public interface PilaADT<T> {
    /**
     * Inserta un elemento en la parte superior de la pila.
     * @param dato El elemento a insertar.
     */
    public void push(T dato);

    /**
     * Elimina y devuelve el elemento en la parte superior de la pila.
     * @return El elemento eliminado.
     */
    public T pop();

    /**
     * Verifica si la pila está vacía.
     * @return true si la pila está vacía, false en caso contrario.
     */
    public boolean isEmpty();

    /**
     * Obtiene el elemento en la parte superior de la pila sin eliminarlo.
     * @return El elemento en la parte superior de la pila.
     */
    public T peek();
}

