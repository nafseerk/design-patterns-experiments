package adapter;

import adapter.Volt;

public class Socket {

  public Volt getVolt() {
    return new Volt(120);
  }
}
