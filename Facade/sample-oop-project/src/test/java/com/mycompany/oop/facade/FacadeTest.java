
package com.mycompany.oop.facade;


import org.junit.Test;
import static org.junit.Assert.*;


public class FacadeTest {

  @Test
  public void testFacade() throws Exception {
      assertEquals(3, Compiler.compile("1 + 2"));

    try {
      // right operand is not a number
      Compiler.compile("1 + x");
      fail("Wyjątek musi zostać zgłoszony");
    } catch (Exception e) {
    }

    try {
        Compiler.compile("1 - 1");
      fail("Wyjątek musi zostać zgłoszony");
  } 
    catch (Exception e) {
  }
  }
  }
 