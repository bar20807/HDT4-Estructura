import java.util.LinkedList;
/**
 * 
 * @author Rodrigo Barrera y Jun Woo
 * Universidad del Valle de Guatemala
 *Codigo tomado del modulo de listas encadenadas
 * @param <T>
 */
public class List<T> implements Menu<T>{
   
    LinkedList<T> datos = new LinkedList<T>();

    
    /** 
     * @param e
     */
    public void push(T e){
        datos.add(e);
    }
    
    /** 
     * @return T
     */
    public T pop(){
        //pop de numeros
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
