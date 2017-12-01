package org.thatguyferg;

import java.util.stream.Collectors;

public class CaesarCipher {

    final private int shift;

    public CaesarCipher(final int shift) {
      this.shift = shift;
    }

    public String encrypt(final String s){
      return s.toUpperCase()
      .chars()
      .boxed()
      .map(c -> String.valueOf((char)((((c.intValue()-65)+shift)%26)+65)))
      .collect(Collectors.joining());
    }
}
