package calculadora;
// hola mundo este es un comentario
//import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//import java.util.Stack;


/** LAFARGA
 * 
 * @author HP Lafarga
 */

//infijo a postfijo

public class Calculadora {
    private String cadena;
    
    public Calculadora(String cadena){
        this.cadena=cadena;
    }

    public String getCadena() {
        return cadena;
    }
    
    //Funcion de utilidad para verificar si la expresion infija tiene completos los parantesis
    public static boolean balanceParentesis(String cadena) {
	PilaA <Character> pila = new PilaA<>(cadena.length());

        char c;
        boolean res = false, exception = false;

        int i = 0; 
        while(i < cadena.length() && !exception){
     // for (char c : cadena.toCharArray()) {
            c = cadena.charAt(i);
            if (c == '(') {
                pila.push(c);
                } 
            else{
                if (c == ')') {
                    try{
                        pila.pop();
                    }
                    catch (ExcepcionColeccionVacia e){
                        exception = true;
                       // System.err.print(e);
                    }
                }
            }
            i++;
        }
        if(!exception)
            res = pila.isEmpty(); // Si la pila está vacía, los paréntesis están balanceados
        return res;
    }
    
    //Funcion de utilidad para devolver la prioridad o precedencia del operador
    //entre mayor sea la precendencia, menor su valor, se sigue jerarquia de operaciones
    public static int marcaPrioridad(char c){ 
        int prioridad = -1;
        
        if(c == '^')
            prioridad = 4;
        else if(c=='*' || c=='/')
                prioridad=3;
        else if(c=='+' || c=='-'){
                prioridad=2;
        }
        return prioridad;
    }
    
    //Funcion utilidad para verificar si un token es un operador
    public static boolean esOperador(char c){
        boolean res = (c =='+' || c =='-' || c =='*' || c =='/' || c=='^');
        
        return res;
    }
    
    //es negative o es substraction, i.e. es operando o operador
    public static boolean esNegativo(char c){
        boolean res = ( c == '-');
        
        return res;
    }
    
    //Funcion que pasa la expresion de infijo a postijo
    public static String infixToPostfix(String cadena){
        StringBuilder sb = new StringBuilder();
        PilaA <Character> pila = new PilaA<>(cadena.length());
        char c, pop;
        
        if(balanceParentesis(cadena)){
            int i=0;
            while(i<cadena.length()){
                c = cadena.charAt(i);
                //System.out.print(" token:" + c);
                
                //caso 1: si el token actual es un corchete de apertura '(', empujarlo al stack
                if(c == '(')
                   pila.push('(');

                //caso 2: si el token actual es un corchete de cierre ')', extrae fichas del stack hasta la apertura '(' y agregalos en el sb
                else if(c == ')'){
                    pop = pila.pop();
                    while(pop != '('){
                        
                    //    System.out.print(pop);

                        sb.append(pop);
                        pop = pila.pop();
                    }
                    //pila.pop();
                }
                
                //caso 3: si el token actual es un operando (numero, letra o punto), lo agrega al final
                else if(Character.isLetterOrDigit(c)){
                    sb.append(c);
                }
                
                
                //caso 4: Si el token actual es un operador
                else if(esOperador(c)){    
                    
                    //si es un menos, distinguir si es negativo o substraccion
                    if(c  == '-'){
                        
                    }
                    else{
                        //eliminar los operadores por jerarquia de operaciones                    
                        while(!pila.isEmpty() && pila.peek()!='(' && marcaPrioridad(c) <= marcaPrioridad(pila.peek())){
                            pop = pila.pop();                        
                            sb.append(pop);
                        }
                        //colocar el operador en el stack
                        pila.push(c);

                    }
                }
 
                //agregar algun otro simbolo al sb, como puntos o comas
                else{
                    sb.append(c);
                }
                //System.out.print(" sufix:" + sb.toString());
                i++;
            }
            
            //vaciar el stack de operadores y agregsarlos a la expresion sb
            while (!pila.isEmpty()) {
                sb.append(pila.pop());
            }
        }
        
        return sb.toString();
    }
    
        // Función para evaluar una expresión de postfijo dada
    public static int evalPostfix(String exp)
    {
        // caso base
        if (exp == null || exp.length() == 0) {
            System.exit(-1);
        }
 
        // crea una stack vacía
        PilaA <Integer> stack = new PilaA<>();
        //Stack<Integer> stack = new Stack<>();
 
        // recorrer la expresión dada
        for (char c: exp.toCharArray())
        {
            // si el carácter actual es un operando, lo empuja a la stack
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            }
            // si el caracter actual es un operador
            else {
                // elimina los dos elementos superiores de la stack
                int x = stack.pop();
                int y = stack.pop();
 
                // evaluar la expresión 'x op y', y empujar el resultado de vuelta a la stack
                if (c == '+') {
                    stack.push(y + x);
                }
                else if (c == '-') {
                    stack.push(y - x);
                }
                else if (c == '*') {
                    stack.push(y * x);
                }
                else if (c == '/') {
                    stack.push(y / x);
                }
            }
        }
 
        // En este punto, la stack se queda con un solo elemento, es decir, resultado de la expresión
        return stack.pop();
    }
    
    public int calcular(){
        String sufijo = infixToPostfix(cadena);
        int res = evalPostfix(sufijo);
        
        return res;
    }
    
    
    
    public static void main(String[] args) {
	Calculadora calcu=new Calculadora("5*((2+4)-2)");
	System.out.print("\n" + calcu.cadena + "  --->  " +Calculadora.infixToPostfix(calcu.cadena)); //Prueba funcional sin decimales ni negativos		System.out.print("\n"+calcu.infixToPostfixConComas());//Prueba funcional que ocupa comas para separar elementos
		
        Calculadora calcu2=new Calculadora("5.12+3.2");
	Calculadora calcu3=new Calculadora("5.1*((2.3+4.0)-23.9)");
        Calculadora calcu4 = new Calculadora("(1*2)*3+4*5+6");
        Calculadora calcu5 = new Calculadora("A+B*(C+D)*(E*F+G)");
        System.out.println("\n" + calcu2.cadena + "  --->  "+Calculadora.infixToPostfix(calcu2.cadena));
        System.out.println("\n" + calcu3.cadena + "  --->  "+Calculadora.infixToPostfix(calcu3.cadena));
        System.out.println("\n" + balanceParentesis(calcu4.cadena));
        System.out.println("\n" + infixToPostfix(calcu4.cadena));
        System.out.println("\n" + calcu5.cadena + "  --->  "+Calculadora.infixToPostfix(calcu5.cadena));
        System.out.println("\n" + 5*-1);
        
        System.out.println("\n" + calcu.calcular());
    }

}

