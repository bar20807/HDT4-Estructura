import java.util.Vector;
/**
 * 
 * @author Rodrigo Barrera y Jun Woo
 * Universidad del Valle de Guatemala
 *
 * @param <T>
 */
public class VectorDatos<T> implements Menu<T>{
    Vector<T> datos = new Vector<T>();
    
    /** 
     * @param e
     */
    public void push(T e){
        datos.add(e);
    }
    
    /** 
     * @return T
     * Pop de los numeros
     */
    public T pop(){
        
        T dato = datos.get(Size()-1);
        datos.remove(dato);
        return dato;
    }
    
    /** 
     * @return int
     */
    public int Size(){
        int longitud = datos.size();
        return longitud;
    }
}
