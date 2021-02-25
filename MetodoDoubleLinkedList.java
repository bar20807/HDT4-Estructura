/**
 * 
 * @author Rodrigo Barrera y Jun Woo
 * Universidad del Valle de Guatemala
 *Este codigo fue tomado del modulo de listas encadenadas
 * @param <T>
 */
public class MetodoDoubleLinkedList<T> extends List<T>{
    protected int count;
    protected MetodoDoubleNode<T> head;
    protected MetodoDoubleNode<T> tail;
    
    /**
     * Constructor de la clase
     */
    public MetodoDoubleLinkedList(){
        head = null;
        tail = null;
        count = 0;
    }
    
    /** 
     * @param e
     * Agrega mas parametros
     */
    public void push(T e){
        head = new MetodoDoubleNode<T>(e, head, null);
        if (tail == null) tail = head;
        count++;
    }
    
    /** 
     * @return T
     * Pop de los numeros
     */
    public T pop(){
        
        MetodoDoubleNode<T> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
    }
    
    
    /** 
     * @return int
     * Retorna el tamaño
     */
    public int Size(){
        return count;
    }
}
