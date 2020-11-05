package com.company.usb;

public class Pendrive implements USBDevice {

    private String name;
    private boolean ejected;

    public Pendrive(String name) {
        this.name = name;
    }

    @Override
    public boolean conenct() {
        System.out.println("Pendrive connected");
        return true;
    }

    public void eject(){
        this.ejected = true;
    }

    @Override
    public boolean disconnect() {

        if(!ejected){
            System.out.println("Please eject pendrive stick first!");
            return false;
        } else {
            System.out.println("Pendrive disconnected");
            return true;
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}
