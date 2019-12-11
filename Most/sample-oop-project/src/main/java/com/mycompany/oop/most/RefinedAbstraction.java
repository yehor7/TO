package com.mycompany.oop.most;

public class RefinedAbstraction extends Abstraction {

  public RefinedAbstraction(Implementor implementor) {
    super(implementor);
  }

  public String operation() {
    return this.implementor.implementation();
  }
}
