package com.mycompany.oop.pelnomocnik;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class ProxyTest {

  @Test
  public void testProxy() {

    Proxy proxy = new Proxy();

  
    assertEquals(null, proxy.getRealSubject());

    proxy.doOperation();

    assertNotNull(proxy.getRealSubject());
  }
}
