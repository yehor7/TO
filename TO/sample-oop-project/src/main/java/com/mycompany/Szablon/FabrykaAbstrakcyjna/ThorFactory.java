package com.mycompany.oop.abstractfactory;

public class ThorFactory implements HeroFactory{
    @Override
    public Weapon getWeapon() {
        return new Hammer();
    }
 
    @Override
    public SuperPower getSuperPower() {
        return new Immortal();
    }
}
