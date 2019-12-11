/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oop.builder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 4
 */
public class ProjectTest {
    
    public ProjectTest() {
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
    public void testGetId_0args() {
        System.out.println("getId");
        Project instance = null;
        int expResult = 2;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetProjectName() {
        System.out.println("getProjectName");
        Project instance = null;
        String expResult = "builder";
        String result = instance.getProjectName();
        assertEquals(expResult, result);
     
    }

   
    @Test
    public void testGetSourceCode() {
        System.out.println("getSourceCode");
        Project instance = null;
        String expResult = "costam";
        String result = instance.getSourceCode();
        assertEquals(expResult, result);
    }


    @Test
    public void testCopy() {
        System.out.println("copy");
        Project instance = null;
        Object expResult = null;
        Object result = instance.copy();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Project instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetId_int() {
        System.out.println("getId");
        int id = 0;
        Project instance = null;
        instance.getId(id);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetProjectName() {
        System.out.println("setProjectName");
        String projektName = "";
        Project instance = null;
        instance.setProjectName(projektName);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetSourceCode() {
        System.out.println("setSourceCode");
        String sourceCode = "";
        Project instance = null;
        instance.setSourceCode(sourceCode);
        fail("The test case is a prototype.");
    }
    
}
