package com.mycompany.opp.Prototype;

public class ConcretePrototype extends Prototype {
    public Prototype copyMe() throws CloneNotSupportedException {
    return (Prototype) this.clone();
  }
}
