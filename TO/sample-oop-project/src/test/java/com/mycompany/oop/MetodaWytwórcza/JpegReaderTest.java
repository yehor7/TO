package com.mycompany.oop.factorymethod;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JpegReaderTest {
    
    public JpegReaderTest() {
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
    public void testGetDecodeImage() {
        System.out.println("getDecodeImage");
        JpegReader instance = null;
        DecodedImage expResult = null;
        DecodedImage result = instance.getDecodeImage();
        assertEquals(expResult, result);
    }
    
}
