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
public class checaErroresTest {
    
    public checaErroresTest() {
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
     * Test of verificaBalance method, of class checaErrores.
     */
    @Test
    public void testVerificaBalance() {
        System.out.println("verificaBalance");
        String[] infija = null;
        boolean expResult = false;
        boolean result = checaErrores.verificaBalance(infija);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaBalanceExpresion method, of class checaErrores.
     */
    @Test
    public void testVerificaBalanceExpresion() {
        System.out.println("verificaBalanceExpresion");
        String expresion = "";
        boolean expResult = false;
        boolean result = checaErrores.verificaBalanceExpresion(expresion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parentesisEnNegativos method, of class checaErrores.
     */
    @Test
    public void testParentesisEnNegativos() {
        System.out.println("parentesisEnNegativos");
        ArrayList<String> infija = null;
        checaErrores.parentesisEnNegativos(infija);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaInfija method, of class checaErrores.
     */
    @Test
    public void testValidaInfija() {
        System.out.println("validaInfija");
        ArrayList<String> cadenaInfija = null;
        boolean expResult = false;
        boolean result = checaErrores.validaInfija(cadenaInfija);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
