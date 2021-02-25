/**
 * 
 * @author Rodrigo Barrera y Jun Woo
 * Universidad del Valle de Guatemala
 * Este codigo fue tomado del modulo de listas encadenadas
 * @param <T>
 */
public class MetodoDoubleNode<T> {
    protected T data;
    protected MetodoDoubleNode<T> nextElement;
    protected MetodoDoubleNode<T> previousElement;

    public MetodoDoubleNode(T v, MetodoDoubleNode<T> next,MetodoDoubleNode<T> previous){
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }

    public MetodoDoubleNode(T v){   
        this(v,null,null);
    }

    
    /** 
     * @return DoubleNode<T>
     * post: returns reference to next value in list
     */
    public MetodoDoubleNode<T> next()
    
    {
       return nextElement;
    }

    
    /** 
     * @param next
     * post: sets reference to new next value
     */
    public void setNext(MetodoDoubleNode<T> next)
   
   {
      nextElement = next;
   }

   
   /** 
    * @return T
    * post: returns value associated with this element
    */
   public T value()
   
   {
      return data;
   }

   
   /** 
    * @param value
    * post: sets value associated with this element
    */
   public void setValue(T value)
   
   {
      data = value;
   }


/** 
 * @return DoubleNode<T>
 */
public MetodoDoubleNode<T> previous() {
	return null;
}
}
