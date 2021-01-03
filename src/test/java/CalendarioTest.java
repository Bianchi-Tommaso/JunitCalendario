/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class CalendarioTest {
    
    public CalendarioTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of AnnoBisestile method, of class Calendario.
     */
    @Test
    public void testAnnoBisestile() {
        System.out.println("AnnoBisestile");
        Calendario instance = new Calendario(29, 2, 2024);
        instance.AnnoBisestile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Calcolo method, of class Calendario.
     */
    @Test
    public void testCalcolo() {
        System.out.println("Calcolo");
        Calendario instance = new Calendario(29, 2, 2024);
        instance.Calcolo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
