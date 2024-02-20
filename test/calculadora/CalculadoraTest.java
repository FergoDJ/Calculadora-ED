/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SPECTRE
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCadena method, of class Calculadora.
     */
    @Test
    public void testGetCadena() {
        System.out.println("getCadena");
        Calculadora instance = null;
        String expResult = "";
        String result = instance.getCadena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarArreglo method, of class Calculadora.
     */
    @Test
    public void testEncontrarArreglo() {
        System.out.println("encontrarArreglo");
        String cadena = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = Calculadora.encontrarArreglo(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esSigno method, of class Calculadora.
     */
    @Test
    public void testEsSigno() {
        System.out.println("esSigno");
        String c = "";
        boolean expResult = false;
        boolean result = Calculadora.esSigno(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of marcaPrioridad method, of class Calculadora.
     */
    @Test
    public void testMarcaPrioridad() {
        System.out.println("marcaPrioridad");
        char ch = ' ';
        int expResult = 0;
        int result = Calculadora.marcaPrioridad(ch);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esOperador method, of class Calculadora.
     */
    @Test
    public void testEsOperador() {
        System.out.println("esOperador");
        String c = "";
        boolean expResult = false;
        boolean result = Calculadora.esOperador(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infixToPostfix method, of class Calculadora.
     */
    @Test
    public void testInfixToPostfix() {
        System.out.println("infixToPostfix");
        String cadena = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = Calculadora.infixToPostfix(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evalPostfix method, of class Calculadora.
     */
    @Test
    public void testEvalPostfix() {
        System.out.println("evalPostfix");
        ArrayList<String> exp = null;
        String cadena = "";
        double expResult = 0.0;
        double result = Calculadora.evalPostfix(exp, cadena);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcular method, of class Calculadora.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        Calculadora instance = null;
        double expResult = 0.0;
        double result = instance.calcular();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Calculadora.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculadora.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
