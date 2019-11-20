package com.mycompany.oop.abstractfactory;

public class HulkFactory implements HeroFactory {
    @Override
    public Weapon getWeapon() {
        return new Hands();
    }
 
    @Override
    public SuperPower getSuperPower() {
        return new Strong();
    }
}
