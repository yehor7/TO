package com.mycompany.oop.most;

abstract class Abstraction {

  protected Implementor implementor;

  public Abstraction(Implementor implementor) {
    this.implementor = implementor;
  }

  abstract String operation();
}
