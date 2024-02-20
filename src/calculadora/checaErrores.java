/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que comprueba que el arreglo infija que recibe la calucladora no contenga errores 
 * para afirmar si esta o no lista para ser pasada a postfija y, posteriormente, evaluarla
 * @author daniela hanneman 
 * 
 */
public class checaErrores {
    
     /**
     * Método privado que determina si un elemento del arreglo es un número.
     * 
     * @param elemento El elemento a verificar.
     * @return true si el elemento es un número; false de lo contrario.
     */
    private static boolean esNumero(String elemento) {
       try {
            Double.parseDouble(elemento);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
     }
    /**
     * Método privado estático que determina si un elemento es un operador válido.
     * 
     * @param elemento El elemento a verificar.
     * @return true si el elemento es un operador válido; false de lo contrario.
     */
    
    private static boolean esOperador(String elemento) {
        return elemento.equals("+") ||elemento.equals("~") || elemento.equals("-") || elemento.equals("·") || elemento.equals("/") || elemento.equals("^");
    }
    /**
     * Método estático público que verifica si los paréntesis, corchetes y llaves en una expresión están balanceados.
     * 
     * @param infija El arreglo de expresiones a verificar.
     * @return true si los paréntesis están balanceados; false de lo contrario.
     */
    public static boolean verificaBalance(String[] infija) {
        for (String expresion : infija) {
            if (!verificaBalanceExpresion(expresion)) {
                return false;
            }
        }
        return true;
    }
    /**
     * Método publico estático que ayuda a verificar el balance de paréntesis en una expresión.
     * 
     * @param expresion La expresión a verificar.
     * @return true si los paréntesis están balanceados; false de lo contrario.
     */
   
    public static boolean verificaBalanceExpresion(String expresion) {
        PilaA <Character> pila = new PilaA<>();

        for (char c : expresion.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) {
                    return false; 
                }
                char tope = pila.pop();
                if ((c == ')' && tope != '(') || (c == ']' && tope != '[') || (c == '}' && tope != '{')) {
                    return false;
                }
            }
        }
        
        return pila.isEmpty(); 
    }
    
    /**
     * Método estático privado para eliminar espacios vacíos del arreglo de cadenas.
     * 
     * @param infija El arreglo de cadenas a limpiar.
     */
    
    private static void quitaEspacios(String infija[]){
        int i, b; 
        for(b=0; b< infija.length; b++){
            if(infija[b].equals(" ")){
		 for (i=0; i<(infija.length)-1; i++)
		 infija[i]= infija[i+1];
		 infija[(infija.length)-1]=null;
                
            }
        }
        
    }
    /**
     * Método estático privado que verifica si todas las operaciones en una expresión son válidas.
     * 
     * @param infija El arreglo de cadenas que representa la expresión.
     * @return true si todas las operaciones son válidas; false de lo contrario.
     */
    
    private static boolean operacionesValidas(String infija[]){
        boolean resp; 
        int i; 
        i=0;
        resp= true;
        quitaEspacios(infija);
        while(i< infija.length && resp){
            if (!esOperador(infija[i]) || !esNumero(infija[i]))
                resp= false;
            i++;
        }
        return resp;
    }
    /**
     * Método estático privado que comprueba que no haya divisiones entre cero en una expresión.
     * 
     * @param infija El arreglo de cadenas que representa la expresión.
     * @return true si no hay divisiones entre cero; false de lo contrario.
     */
    
    private static boolean noDivideEntreCero(String infija[]){
        int i; 
        boolean resp; 
        resp= true;
        for (i=0; i< infija.length;i++){
            if(!infija[i].equals("/")) 
                if (infija[i+1].charAt(0)==0)
                resp= false;
        }
        return resp;
            
            
    }
    /**
     * Método estático privado que verifica que haya un número antes y después de cada operador en una expresión.
     * 
     * @param infija El arreglo de cadenas que representa la expresión.
     * @return true si hay un número antes y después de cada operador; false de lo contrario.
     */
   private static boolean numerosAntesYDspDeOperando(String infija[]){
        int i; 
        boolean resp; 
        resp= true;
        i=0;
        while (i< infija.length && resp){
            if (esOperador(infija[i]) && esNumero(infija[i-1])&& esNumero(infija[i+1]))
                  i++;
             else  
                resp= false;
        }
        return resp;
    }
   /**
     * Método estático privado que comprueba que el inicio y el fin de la expresión sean válidos.
     * 
     * @param infija El arreglo de cadenas que representa la expresión.
     * @return true si el inicio y el fin de la expresión son válidos; false de lo contrario.
     */
   
   private static boolean bienPrincipioYFin(String infija[]){
       boolean resp;  
       int i=0; 
       resp= false;
       int n= infija.length;
       if (esNumero(infija[i]) || infija[i].charAt(0)=='+' || infija[i].charAt(0)== '~' ||infija[i].charAt(0)== '(' |infija[i].charAt(0)== '['|infija[i].charAt(0)== '{' )
           if (esNumero(infija[n])||infija[n].charAt(0)== ')'||infija[n].charAt(0)== ']'||infija[n].charAt(0)== '}')
               resp= true;
       return resp;
   }
   
   /**
     * Método estático privado que coloca paréntesis alrededor de los números negativos para respetar la jerarquía de operaciones.
     * 
     * @param infija El arreglo de cadenas que representa la expresión.
     */
   public static void parentesisEnNegativos(ArrayList<String> infija){
       int i;
       i=0;
       while(i< infija.size()-1){
           if (esOperador(infija.get(i))&& infija.get(i+1).equals("-")){
               infija.add(i, "(");             
           }
           i++;
       }   
   }
   
   /**
     * Método público que valida una expresión infija considerando todos los métodos privados de la clase.
     * 
     * @param cadenaInfija La cadena que representa la expresión.
     * @return true si la expresión es válida; false de lo contrario.
     */
   
   public static boolean validaInfija(ArrayList<String> cadenaInfija){
       String[] infija = cadenaInfija.toArray(String[]::new);
       
       boolean resp; 
       if (numerosAntesYDspDeOperando(infija) && bienPrincipioYFin (infija) && noDivideEntreCero(infija) && operacionesValidas(infija) && verificaBalance(infija))
           resp= true; 
       else 
           resp= false; 
       return resp; 
   }
     
    }
    
    

