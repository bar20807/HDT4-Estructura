import java.util.ArrayList;
/**
 * 
 * @author Rodrigo Barrera y Jun Woo
 * Universidad del Valle de Guatemala
 * @param <T>
 */
public class MetodoArray<T> implements Menu<T> {
    ArrayList<T> datos = new ArrayList<T>();
    

    
    /** 
     * @param e
     * Agrega parametros
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
     * Retorna la longitud
     */
    public int Size(){
        int longitud = datos.size();
        return longitud;
    }
    
}
