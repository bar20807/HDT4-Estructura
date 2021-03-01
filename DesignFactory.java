/**
 * 
 * @author Rodrigo Barrera y Jun Woo
 * Universidad del Valle de Guatemala
 *
 */
public class DesignFactory {
    
    /** 
     * @param dato
     * @return MenuGeneral
     * Clase factory que nos servira para que el usuario pueda escoger la manera 
     * en la que quiere llevar a cabo su operacion, mediante los diferentes metodos
     * de dificultad
     */
    public Menu opcionMenu(int dato){
        int counter=0;
        if(dato == 1){
            if(counter==0){
                return new MetodoArray<String>();
            }else{
                return new MetodoArray<Float>();            
            }
        }else if(dato==2){
            if(counter==0){
                return new VectorDatos<String>();
            }else{
                return new VectorDatos<Float>();
            }
        }else if(dato==4){
            if(counter==0){
                return new MetodoSinlgyLinkedList<String>();
            }else{
                return new MetodoSinlgyLinkedList<Float>();
            }
        }else if(dato==5){
            if(counter==0){
                return new MetodoDoubleLinkedList<String>();
            }else{
                return new MetodoDoubleLinkedList<Float>();
            }
        }
        return null;
    }
}