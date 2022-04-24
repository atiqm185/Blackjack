/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author srini
 */
public class UserPlayerTest {
    
    @Test
    public void testCanPlayGood() {
        System.out.println("User can Play Good ");
        UserPlayer instance = new UserPlayer(20);
        boolean expResult = false;
        boolean result = instance.canPlay();
      //  assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

     @Test
    public void testCanPlayBad() {
        System.out.println("User can Play Bad ");
        UserPlayer instance = new UserPlayer(23);
        boolean expResult = false;
        boolean result = instance.canPlay();
      //  assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    @Test
    public void testCanPlayBoundary() {
        System.out.println("User can Play Boundary ");
        UserPlayer instance = new UserPlayer(21);
        boolean expResult = false;
        boolean result = instance.canPlay();
      //  assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
}
