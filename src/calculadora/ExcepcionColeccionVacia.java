/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package calculadora;

/**
 * Clase ExcepcionColeccionVacia: Representa una excepción personalizada para indicar que una colección está vacía.
 * Autor: HP Lafarga
 */

public class ExcepcionColeccionVacia extends RuntimeException {

    /**
     * Constructor de la excepción.
     * @param mensaje El mensaje de error asociado a la excepción.
     */
    public ExcepcionColeccionVacia(String mensaje) {     
        super(mensaje);
    }

}
