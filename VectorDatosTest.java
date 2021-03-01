import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorDatosTest<T> {

    @Test
    void push() {
        List<T> l = new List<T>();
        l.datos.push((T) "Hola");
        assertEquals("Hola", l.datos.getFirst());
    }

    @Test
    void pop() {
        List<T> l = new List<T>();
        l.datos.push((T) "Hola");
        l.datos.pop();
        int longitud = l.datos.size();
        assertEquals(0, longitud);
    }

    @Test
    void size() {
        List<T> l = new List<T>();
        l.datos.push((T) "Hola");
        int longitud = l.datos.size();
        assertEquals(1, longitud);
    }
}