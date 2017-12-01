package org.thatguyferg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CaesarCipherTest {

  @Test
  public void doesitWork() {
    CaesarCipher cipher = new CaesarCipher(4);
    assertEquals("HSK", cipher.encrypt("dog"));
  }
}
