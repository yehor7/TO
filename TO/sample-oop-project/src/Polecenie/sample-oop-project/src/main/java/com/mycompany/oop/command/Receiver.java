package com.mycompany.oop.command;

public class Receiver {

  private boolean operationPerfomed = false;

  public void action() {
    operationPerfomed = true;
  }

  protected boolean isOperationPerfomed() {
    return operationPerfomed;
  }
}
