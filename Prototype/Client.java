package com.mycompany.opp.Prototype;

public class Client {
  private Prototype prototype;
  public Client(Prototype prototype) {

    this.prototype = prototype;
  }

  public Prototype operation() throws CloneNotSupportedException {
    return prototype.copyMe();
  }
}
