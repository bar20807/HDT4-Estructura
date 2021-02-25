/**
 * 
 * @author Rodrigo Barrera y Jun Woo
 * Universidad del Valle de Guatemala
 * Este codigo fue tomado del modulo de listas encadenadas
 * @param <T>
 */
public class MetodoNode <T>{
    protected T data; // value stored in this element
    protected MetodoNode<T> nextElement; // ref to next
    
   public MetodoNode(T v, MetodoNode<T> next)
   // pre: v is a value, next is a reference to 
   //      remainder of list
   // post: an element is constructed as the new 
   //      head of list
   {
       data = v;
       nextElement = next;
   }

   public MetodoNode(T v)
   // post: constructs a new tail of a list with value v
   {
      this(v,null);
   }

   
   /** 
    * @return Node<T>
    * post: returns reference to next value in list
    */
   public MetodoNode<T> next()
   
   {
      return nextElement;
   }

   
   /** 
    * @param next
    * post: sets reference to new next value
    */
   public void setNext(MetodoNode<T> next)
   
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
}
