package com.mycompany.opp.Prototype;


import static org.junit.Assert.assertNotEquals;
import org.junit.Test;


public class PrototypeTest {

  @Test
  public void testPrototype() throws CloneNotSupportedException {


    Prototype prototype = new ConcretePrototype();

    Client client = new Client(prototype);


    Prototype prototypeClone = client.operation();


    assertNotEquals(prototype, prototypeClone);
  }
}