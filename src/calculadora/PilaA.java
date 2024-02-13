/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author HP
 */
public class PilaA <T> implements PilaADT <T>{
//atributos
    private T[] pila;
    private int tope;
    private final int MAX=100;
    
    //Constructores
    public PilaA(){
        pila=(T[]) new Object[MAX];//PAra castear a tipo T, primero construyes un tipo Object y lo casteas a T
        tope=-1;//lo pinemos en menos ubno para el método isEmpty
              
    }
    
    public PilaA(int max){
        pila=(T[]) new Object[max];//PAra castear a tipo T, primero construyes un tipo Object y lo casteas a T
        tope=-1;//lo pinemos en menos ubno para el método isEmpty
              
    }


    //implementación de atributos de su interfaz
    @Override
    public void push(T dato) {
        if(tope+1 == pila.length){//pila llena
            expande();
        }
        tope++;
        pila[tope]=dato;
    }
    
    //método que construye un arreglo más grand ey copia los elementos de la pila
    //a él, reasignando el valor del atributo "pila"
    private void expande(){
         T[] masGrande=(T[]) new Object[pila.length*2];
         
         for(int i=0;i<pila.length;i++){
             masGrande[i]=pila[i];
         }
         pila=masGrande;
        
    }
  @Override
    public T pop() {//le podemos regresar el nulo pues este es compatible con cualquier clase
        if(this.isEmpty()){
            throw new ExcepcionColeccionVacia ("La pila está vacía");//error provocado 
        }
        T eliminado;
        eliminado=pila[tope];
        pila[tope]=null;
        tope--;
        return eliminado;
    }

    @Override
    public boolean isEmpty() {
        return tope == -1;
        //si es igual a -1 es verdadero, lo que significa que está vacío; de lo contratio no será -1 y regresará false
    }

    @Override
    public T peek() {
        if(this.isEmpty()){
            throw new ExcepcionColeccionVacia ("La pila esta vacia");//error provocado 
        }    
        return pila[tope];
    }

    public String toString(){
        StringBuilder sb=new StringBuilder ("Pila de 0 a tope \n");
        
        for(int i=0;i<=tope; i++)
            sb.append(pila[i]).append(" ");
        
        return sb.toString();
    }

    
}


