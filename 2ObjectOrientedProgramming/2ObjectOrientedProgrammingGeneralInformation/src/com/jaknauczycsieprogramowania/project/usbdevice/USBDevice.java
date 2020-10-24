package com.jaknauczycsieprogramowania.project.usbdevice;

public interface USBDevice {

    boolean connect();
    boolean disconnect();
    String getName();

}
