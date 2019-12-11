package com.mycompany.opp.Prototype;

public abstract class Prototype implements Cloneable {
    
    abstract Prototype copyMe() throws CloneNotSupportedException;
}
