package calculadora;
// hola mundo este es un comentario

import java.util.ArrayList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//import java.util.Stack;


/** 
 * Clase calculadora donde se encuentran los metodos principales de la calculadora
 * @author HP Lafarga
 */

public class Calculadora {
    private String cadena;
    
    /**
     * Constructor de la clase Calculadora.
     * @param cadena La cadena de entrada para la calculadora.
     */
    public Calculadora(String cadena){
        this.cadena=cadena;
    }

    /**
     * Obtiene la cadena actual de la calculadora.
     * @return La cadena actual.
     */
    public String getCadena() {
        return cadena;
    }
    
    /**
     * Encuentra los elementos de la cadena original y los almacena en un arreglo.
     * @param cadena La cadena original.
     * @return Un ArrayList de elementos.
     */
    public static ArrayList<String> encontrarArreglo(String cadena){
        ArrayList<String> arregloInfijo = new ArrayList<>();
        int i = 0; //contador
        String elemento = "";//Variable auxiliar para guardar los caracteres
      
        //Inserta los números que están juntos al arreglo y separa los operadores 
        while(i < cadena.length() - 1){
            //Se guardan los caracteres, hasta que encuentre un signo concatenará los números juntos
            elemento += cadena.charAt(i)+"";
            
            if(esSigno(cadena.charAt(i + 1) + "") || esSigno(elemento)){
                // !!!Atencion a negativos!!
                if(elemento.equals("-")){
                    if(i == 0 || cadena.charAt(i-1) =='('){
                        arregloInfijo.add("0");
                        arregloInfijo.add( "-");
                        elemento = "";                      
                    }
                    else if(cadena.charAt(i - 1) == '*' || cadena.charAt(i - 1) == '/' || cadena.charAt(i-1) == '^'){ //con operadores
                        //hacer nada
                    }
                    else{
                        arregloInfijo.add(elemento); //agrega el elemento al arreglo para la substraccion
                        elemento = "";                       
                    }
                }
                //si hay un parentesis y hay un numero antes entonces se esta multiplicando
                else if(elemento.equals("(") && i>0 && !esSigno(cadena.charAt(i-1)+"")){
                    arregloInfijo.add("*");
                    arregloInfijo.add(elemento);
                    elemento = "";
                }
                else if(elemento.equals(")") && i<cadena.length() && !esSigno(cadena.charAt(i+1)+"")){
                    arregloInfijo.add(elemento);
                    arregloInfijo.add("*");
                    elemento = "";
                }
                //Si encuentra un signo en el siguiente indice, vacía los números, y en el siguiente ciclo dejará el signo encontrado
                else{
                    arregloInfijo.add(elemento); //agrega el elemento al
                    elemento = "";
                }
            }
            i++;
        }
        
        //Inserta el último valor de la cadena que no se tomó en cuenta arriba
        //Pregunta si el penúltimo y último elemento fueron signos, por ejemplo 2+(5x(3-2))
        if(esSigno(cadena.charAt(i)+"") && elemento.equals("")){ 
            arregloInfijo.add(cadena.charAt(i)+"");
            
        //Pregunta si el penúltimo elemento fue número y si el último fue signo, por ejemplo 2+(5x3-2.23)
        }else if (esSigno(cadena.charAt(i)+"")){
            arregloInfijo.add(elemento);
            
            arregloInfijo.add(cadena.charAt(i)+"");
            
        //Pregunta si el último elemento fue número, se asegura de guardar lo que quedó en la variable "elemento", ejemplo 2+2.23
        }else{
            elemento+=cadena.charAt(i)+"";
            arregloInfijo.add(elemento);
            
        }
        checaErrores.parentesisEnNegativos(arregloInfijo);
        
        return arregloInfijo;
    }

    /**
     * Verifica si un carácter es un signo (operador).
     * @param c El carácter a verificar.
     * @return true si es un signo, false en caso contrario.
     */
    public static boolean esSigno(String c){
        return c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/") || c.equals("^") || c.equals("(") || c.equals(")");
    }
    
    /**
     * Devuelve la prioridad o precedencia del operador.
     * Cuanto mayor sea la precedencia, menor será su valor.
     * @param ch El operador.
     * @return La prioridad del operador.
     */
    public static int marcaPrioridad(char ch){ 
        int prioridad = -1;
        
        if(ch == '^')
            prioridad = 4;
        else if(ch=='*' || ch=='/')
                prioridad=3;
        else if(ch=='+' || ch=='-'){
                prioridad=2;
        }
        return prioridad;
    }
    
    /**
     * Verifica si un token es un operador.
     * @param c El token a verificar.
     * @return true si es un operador, false en caso contrario.
     */
    public static boolean esOperador(String c){
        return (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/") || c.equals("^"));
    }
    
    
    /**
     * Función que convierte una expresión infija en postfija
     * @param cadena La expresión infija
     * @return Un arreglo de cadenas con la expresión postfija
     */
    public static ArrayList<String> infixToPostfix(String cadena) {
        ArrayList<String> sufijo = new ArrayList<>();
        PilaA <Character> pila = new PilaA<>(cadena.length());
        String c;
        char ch, chPop;
        ArrayList<String> arregloInfijo;
        arregloInfijo = encontrarArreglo(cadena);        

        if (checaErrores.verificaBalanceExpresion(cadena)) {
            
            //int numElementos = 0;
            int cantElementosArr = arregloInfijo.size();
            
            for(int i = 0; i<cantElementosArr; i++ ){
                c = arregloInfijo.get(i);
                //System.out.print(" token:" + c);
                
                //caso 1: si el token actual es un corchete de apertura '(', empujarlo al stack
                if(c.equals("("))
                   pila.push('(');

                //caso 2: si el token actual es un corchete de cierre ')', extrae fichas del stack hasta la apertura '(' y agregalos en el sufijo
                else if(c.equals(")")){
                    chPop = pila.pop();
                    while(chPop != '('){
                        sufijo.add("" + chPop);
                        
                        chPop = pila.pop();
                    }
                }
                
                //caso 4: Si el token actual es un operador
                else if(esOperador(c)){    
                    ch = c.charAt(0);
             
                    while(!pila.isEmpty() && pila.peek()!='(' && marcaPrioridad(ch) <= marcaPrioridad(pila.peek()) ){
                        chPop = pila.pop();                        
                        sufijo.add("" + chPop);
                        
                    }
                    //colocar el operador en el stack
                    pila.push(ch);

                    
                }
 
                //caso 4: si el token actual es un operando (numero, letra o punto), o lo que sea
                else{
                    sufijo.add(c);
                    
                }
                
                //System.out.print(" sufix:" + sufijo.toString());
            }
            
            //vaciar el stack de operadores y agregsarlos a la expresion sufijo
            while (!pila.isEmpty()) {
                sufijo.add( "" + pila.pop());
                

            }
            //sufijo[cadena.length()] = numElementos + "";
        }
        
        return sufijo;
    }
    
    /** Función para evaluar una expresión de postfijo dada
     * @param exp La expresión postfija.
     * @param cadena La cadena original.
     * @return El resultado de la evaluación.
     */
    public static double evalPostfix(ArrayList<String> exp, String cadena){
        // caso base
        if (exp.isEmpty()) {
            System.exit(-1);
        }
 
        // crea una stack vacía
        PilaA <Double> stack = new PilaA<>();
        //Stack<Integer> stack = new Stack<>();
        double x, y;
        double num;
        String c;
        int cantElementosArr = exp.size();

        
        // recorrer la expresión dada
        for(int i = 0; i<cantElementosArr; i++ ) {
            c = exp.get(i);
            
            // si el carácter actual es un operando, lo empuja a la stack
            if (!esSigno(c) ) {
                num = Double.parseDouble(c);
                stack.push(num);
            }
            // si el caracter actual es un operador
            else {
                // elimina los dos elementos superiores de la stack
                x = stack.pop();
                y = stack.pop();
 
                // evaluar la expresión 'x op y', y empujar el resultado de vuelta a la stack
                if (c.equals("+")) {
                    stack.push(y + x);
                }
                else if (c.equals("-")) {
                    stack.push(y - x);
                }
                else if (c.equals("*")) {
                    stack.push(y * x);
                }
                else if (c.equals("/")) {
                    stack.push(y / x);
                }
                else if (c.equals("^")) {
                    stack.push(Math.pow(y, x));
                }
            }
        }
        // En este punto, la stack se queda con un solo elemento, es decir, resultado de la expresión
        return stack.pop();
    }
    
    /**
     * Calcula el resultado de la expresión dada.
     * Integra y utiliza todos los metodos estaticos anteriores para calcular
     * @return El resultado de la expresión.
     */
    public double calcular(){
        ArrayList<String> sufijo = infixToPostfix(cadena);
        double res = evalPostfix(sufijo, cadena);
        
        return res;
    }
   
    /**
     * Este es un main de prueba que se utilizo para probar la funcionalidad del metodo calcular y de todos los metodos de la clase Calculadora
     * @param args
     */
    public static void main(String[] args) {
	Calculadora calcu=new Calculadora("5*((2+4)-2)");
	System.out.print("\n" + calcu.cadena + "  --->  " + Calculadora.encontrarArreglo(calcu.cadena)+ "  --->  " + Calculadora.infixToPostfix(calcu.cadena)); //Prueba funcional sin decimales ni negativos		System.out.print("\n"+calcu.infixToPostfixConComas());//Prueba funcional que ocupa comas para separar elementos
        System.out.println("\n" + calcu.calcular());

        
        Calculadora calcu2=new Calculadora("5.12+3.2");
        System.out.println("\n" + calcu2.cadena + "  --->  "+ Calculadora.infixToPostfix(calcu2.cadena).toString());
        System.out.println("\n" + calcu2.calcular());
        
	Calculadora calcu3=new Calculadora("5.1*((2.3+4.0)-23.9)");
        System.out.println("\n" + calcu3.cadena + "  --->  "+ Calculadora.infixToPostfix(calcu3.cadena).toString());
        System.out.println("\n" + calcu3.calcular());

        
        Calculadora calcu4 = new Calculadora("(1*2)*3+4*5+6");
        System.out.println("\n" + infixToPostfix(calcu4.cadena));
        
        Calculadora calcu5 = new Calculadora("A+B*(C+D)*(E*F+G)");
        System.out.println("\n" + calcu5.cadena + "  --->  "+Calculadora.infixToPostfix(calcu5.cadena).toString());
        
        System.out.println("\n" + 5*-1);
        
        Calculadora calcu6 = new Calculadora("-3*2");
        System.out.println("\n" + calcu6.cadena +  "  --->  " + Calculadora.encontrarArreglo(calcu6.cadena)+ "  --->  " + "  --->  "+ Calculadora.infixToPostfix(calcu6.cadena).toString());
        System.out.println("\n" + calcu6.calcular());
        
        Calculadora calcu7 = new Calculadora("2*-3");
        System.out.println("\n" + calcu7.cadena +  "  --->  " + Calculadora.encontrarArreglo(calcu7.cadena)+ "  --->  " + "  --->  "+ Calculadora.infixToPostfix(calcu7.cadena).toString());
        System.out.println("\n" + calcu7.calcular());
    }

}