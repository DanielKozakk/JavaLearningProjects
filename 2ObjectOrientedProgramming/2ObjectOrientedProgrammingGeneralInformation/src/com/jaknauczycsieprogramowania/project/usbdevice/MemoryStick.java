package com.jaknauczycsieprogramowania.project.usbdevice;

public class MemoryStick implements USBDevice {


    private String name;
    boolean ejected = false;


    public MemoryStick(String name) {
        this.name = name;
    }

    public void eject(){
        System.out.println("Ejecting Memory stick");
        ejected = true;
    }
    @Override
    public boolean connect() {
        System.out.println("MemoryStick connected!");
        return true;
    }

    @Override
    public boolean disconnect() {

        if(!ejected){
            System.out.println("Eject memory stick first!");

            return false;
        } else {
            System.out.println("MemoryStick connected!");
            return true;

        }


    }

    @Override
    public String getName() {
        return name;
    }
}
