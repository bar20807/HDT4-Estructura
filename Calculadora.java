/**
 * 
 * @author Rodrigo Barrera y Jun Woo
 *Universidad del Valle de Guatemala
 */
public class Calculadora {
    //Declaracion de los atributos
    Float numero1=0f;
    Float numero2=0f;
    String TipoOperacion;
    Float resultado = 0f;
    
    public Calculadora() {
	}

	/** 
     * @param linea
     * @return String
     * Se encargara de llevar a cabo la operacion o calculos de la operacion que se ingrese
     */
    public String Calculo(String linea, Menu<String> operandos, Menu<Float> datos){
        //Define las clases que se van a utilizar
        Menu<Float> numeros= datos;
        Menu<String> signos = operandos;
        resultado = 0f;

        //Metodo que se encargara de guardar la información segun el tipo de dato que sea
        for(int i=0; i<linea.length();i++){
            //obtener segun la variable
            char result = linea.charAt(i);
            String s =String.valueOf(result);
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                signos.push(s);
                
            }else{
                float f = Float.parseFloat(s);
                numeros.push(f);
            }
            //Estos if se encargan de revisar si ya hay dos datos y en caso que si revisar tambien si ya hay algun operando
            if(numeros.Size()>=2 && signos.Size()>=1){
                //Opera la informacion
                numero1 = numeros.pop();
                numero2 = numeros.pop();
                TipoOperacion = signos.pop();
                //Opera segun el signo
                if(TipoOperacion.equals("+")){
                    resultado = numero1 + numero2;
                }else if(TipoOperacion.equals("-")){
                    resultado = numero2 - numero1; 
                }else if(TipoOperacion.equals("/")){
                    resultado = numero2 / numero1;
                }else if(TipoOperacion.equals("*")){
                    resultado = numero1 * numero2;
                }
                //Push que se encarga de agregar el resultado al stack
                numeros.push(resultado);
            }
        }
        
        //Mostrar resultado
        String resultadoTexto = String.valueOf(resultado);
        return resultadoTexto;
    }
}
