/**
 * @author Rodrigo Barrera y Jun Woo
 * Universidad del Valle de Guatemala
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Stack;
class Main {
  
  /** 
   * Clase donde se manejara el menú principal para que el usuario escoja que dificultad desea
   * @param args
   */
  public static void main(String[] args) {
    //Instancia del metodo Singlenton
    MetodoSingleton calculadora =MetodoSingleton.getInstance();

    ArrayList<String> infix = new ArrayList<String>();
    ArrayList<String> postfix = new ArrayList<String>();
    //Metodo para guardar los datos
        try{
            File datos = new File("Info.txt");
            Scanner lecturaArchivo = new Scanner(datos);

            while(lecturaArchivo.hasNextLine()){
                String expresion = lecturaArchivo.nextLine();
                infix.add(expresion);
            }
            lecturaArchivo.close();
        }catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo");
            e.printStackTrace();
        }
        //Convierte de infix a postfix
    for(String lineas: infix){
      postfix.add(infixToPostfix(lineas));
    }
    //Muestra lo de infix
    for(String lineas: infix){
      System.out.println("Datos en infix: "+lineas);
    }
    //Muestra lo de posfix
    for(String lineas: postfix){
      System.out.println("Datos en postfix: "+lineas);
    }
    //Es el que trabaja segun lo que deseo el usuario
    int elegido =menuOpciones();
    DesignFactory eligir = new DesignFactory();
    System.out.println("---------------------");
    Menu<String> operando = eligir.opcionMenu(elegido);
    Menu<Float> datos = eligir.opcionMenu(elegido);

    
    //Se encarga de realizar los calculos en la calculadora
    for(String lineas: postfix){
      String dato = calculadora.caclular(lineas, operando, datos);
      System.out.println(dato);
       
    }  

    System.out.println("------------------------------------");

  }
  
  /** 
   * @param ch
   * @return int
   * Sirve para retornar segun el tipo de signo que tenga
   */
  
  public static int Caracteres(char ch){ 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 

  
  /** 
   * @param dato
   * @return String
   * Convierte de infix a postfix
   */
  
  public static String infixToPostfix(String dato){
    // Crea un string vacio
    String resultado = new String(""); 
          
    // Crea un stack vacio
    Stack<Character> stack = new Stack<>(); 
      
    for (int i = 0; i<dato.length(); ++i) 
    { 
        char c = dato.charAt(i); 
          
        // Revisar si es un operando como un + - * /
        if (Character.isLetterOrDigit(c)) 
            resultado += c; 
           
        // Revisar si es un (
        else if (c == '(') 
            stack.push(c); 
          
        // Revisar si es un ) 
        else if (c == ')') 
        { 
            while (!stack.isEmpty() &&  
                    stack.peek() != '(') 
                resultado += stack.pop(); 
              
                stack.pop(); 
        } 
        else 
        { 
            while (!stack.isEmpty() && Caracteres(c)<= Caracteres(stack.peek())){ 
                
                resultado += stack.pop(); 
         } 
            stack.push(c); 
        } 
   
    } 
   
    // En este while se hace el pop de los operandos en el Stack
    while (!stack.isEmpty()){ 
        if(stack.peek() == '(') 
            return "Expresión invalida"; 
        resultado += stack.pop(); 
     } 
    return resultado; 
  }

  
  /** 
   * @return int
   */
  //Menu de opciones
  public static int menuOpciones(){
    boolean ciclo=true;
    Scanner entrada = new Scanner(System.in);
    int elegido=0;
    do{
      System.out.println("--------------- Menú de opciones -----------------");
      System.out.println("¿Que metodo desea utilizar?");
      System.out.println("1. ArrayList");
      System.out.println("2. Vector");
      System.out.println("3. Lista");
      //escoger
      elegido = opcionMenu();
      //pedir si quiere single o double linked list
      if(elegido==3){
        System.out.println("4. SingleLinkedList");
        System.out.println("5. DoubleLinkedList");
        elegido=MetodosListas();
      }
      ciclo=false;
    }while(ciclo);
    return elegido;
  }

  
  /** 
   * @return int
   *Se encarga de verificar que sea un  numero el dato ingresado
   */
  
  public static int opcionMenu(){
    Scanner entrada = new Scanner(System.in);
    int opcionNumero=0;
    boolean ciclo_numero=true;
            do{
                try{
                    String opcion = entrada.next();
                    //verificar que sea una opcion adecuada
                    opcionNumero = Integer.parseInt(opcion);
                    if(opcionNumero>=1 && opcionNumero<=3){
                        ciclo_numero=false;
                    }else{
                        System.out.println("Porfavor, elija una de las opciones que se presentan en el menu");
                    }
                }catch(Exception e){
                    System.out.println("Solo se permiten datos numericos");
                }
            }while(ciclo_numero);

    return opcionNumero;
  }
  
  /** 
   * @return int
   */
  //menu para escoger la lista
  public static int MetodosListas(){
    Scanner entrada = new Scanner(System.in);
    int opcionNumero=0;
    boolean ciclo_numero=true;
            do{
                try{
                    String opcion = entrada.next();
                    //verificar que sea una opcion adecuada
                    opcionNumero = Integer.parseInt(opcion);
                    if(opcionNumero>=4 && opcionNumero<=5){
                        ciclo_numero=false;
                    }else{
                        System.out.println("Porfavor, escoja una de las opcioens que se presentan en el menu");
                    }
                }catch(Exception e){
                    System.out.println("Ingersa solo datos numericos");
                }
            }while(ciclo_numero);

    return opcionNumero;


  }
}