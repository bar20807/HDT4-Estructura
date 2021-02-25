/**
 * 
 * @author Rodrigo Barrera y Jun Woo
 * Universidad del Valle de Guatemala
 *
 * @param <T>
 */
public interface Menu<T> {
    void push(T e);
    T pop();
    int Size();
}
