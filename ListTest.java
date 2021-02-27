import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class ListTest<T> {

    @org.junit.jupiter.api.Test
    void push() {
        List<T> l = new List<T>();
        l.datos.push((T) "hello");
        assertEquals("hello", l.datos.getFirst());
    }

    @org.junit.jupiter.api.Test
    void pop() {
        List<T> l = new List<T>();
        l.datos.push((T) "hello");
        l.datos.pop();
        int longitud = l.datos.size();
        assertEquals(0, longitud);

    }

    @org.junit.jupiter.api.Test
    void size() {
        List<T> l = new List<T>();
        l.datos.push((T) "hello");
        int longitud = l.datos.size();
        assertEquals(1, longitud);


    }
}