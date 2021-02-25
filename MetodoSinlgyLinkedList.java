/**
 * 
 * @author Rodrigo Barrera y Jun Woo
 * Universidad del Valle de Guatemala
 *Codigo tomado del modulo de listas encadenadas
 * @param <T>
 */
public class MetodoSinlgyLinkedList<T> extends List<T>{
    protected int count; 
    protected MetodoNode<T> head; 

    public void SinglyLinkedList(){
      head = null;
      count = 0;
    }

    
    /** 
     * @param e
     */
    public void push(T e){
        head = new MetodoNode<T>(e, head);
        count++;
    }
    
    /** 
     * @return T
     * Pop de los numeros
     */
    public T pop(){
        
        MetodoNode<T> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
    }
    
    
    /** 
     * @return int
     */
    public int Size(){
        return count;
    }
}
