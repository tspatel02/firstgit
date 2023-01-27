/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.itexps;

import com.itexps.utility.firstprojectnb.Calculator;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author itexps
 */
public class CalculatorTest {
    Calculator calc;  //declare
    
    public CalculatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        calc = new Calculator();  //intiated 
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test 
    public void testAdd() {
        assertEquals(calc.add(2,4), 6);
    }
}
