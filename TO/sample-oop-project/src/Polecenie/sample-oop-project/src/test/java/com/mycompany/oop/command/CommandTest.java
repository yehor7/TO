package com.mycompany.oop.command;

import org.junit.Test;
import static org.junit.Assert.*;

public class CommandTest {
    
  @Test
  public void testCommand() {

    Receiver receiver = new Receiver();
    Command command = new ConcreteCommand(receiver);
    Invoker invoker = new Invoker(command);

    assertEquals(false, receiver.isOperationPerfomed());
    invoker.execute();
    assertEquals(true, receiver.isOperationPerfomed());
  }
}
