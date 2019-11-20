package com.mycompany.oop.abstractfactory;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HulkFactoryTest {
    
    public HulkFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetWeapon() {
        System.out.println("getWeapon");
        HulkFactory instance = new HulkFactory();
        Weapon expResult = null;
        Weapon result = instance.getWeapon();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSuperPower() {
        System.out.println("getSuperPower");
        HulkFactory instance = new HulkFactory();
        SuperPower expResult = null;
        SuperPower result = instance.getSuperPower();
        assertEquals(expResult, result);
    }
    
}
