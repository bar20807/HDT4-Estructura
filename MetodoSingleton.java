/** 
 * @author Rodrigo Barrera y Jun Woo
 *	Pagina citada para singlenton: 
 *	https://www.geeksforgeeks.org/singleton-class-java/
*/
public class MetodoSingleton {
    private static MetodoSingleton single_instance = null; 
  
    // variable of type String 
    Calculadora calculadora;
  
    
    /**
     *private constructor restricted to this class itself  
     */
    private MetodoSingleton() 
    { 
        calculadora = new Calculadora();
    } 
    /**
     * 
     * @param linea
     * @param operandos
     * @param datos
     * @return Retorna los calculos realizados
     */
    public String caclular(String linea, Menu<String> operandos, Menu<Float> datos){

        return calculadora.Calculo(linea, operandos, datos);
    }
  
    
    /**
     *static method to create instance of Singleton class 
     * @return the instance of class
     */
    public static MetodoSingleton getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new MetodoSingleton(); 
  
        return single_instance; 
    } 
}
