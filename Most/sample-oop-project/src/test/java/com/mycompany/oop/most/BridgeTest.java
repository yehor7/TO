package com.mycompany.oop.most;


import org.junit.Test;
import static org.junit.Assert.*;

public class BridgeTest {

@Test
  public void testBuilder() {

    RefinedAbstraction refinedAbstractionA = new RefinedAbstraction(
        new ConcreteImplementorA());
    assertEquals("com.mycompany.oop.most.ConcreteImplementorA",
        refinedAbstractionA.operation());
    RefinedAbstraction refinedAbstractionB = new RefinedAbstraction(
        new ConcreteImplementorB());
    assertEquals("com.mycompany.oop.most.ConcreteImplementorB",
        refinedAbstractionB.operation());
  
}
}