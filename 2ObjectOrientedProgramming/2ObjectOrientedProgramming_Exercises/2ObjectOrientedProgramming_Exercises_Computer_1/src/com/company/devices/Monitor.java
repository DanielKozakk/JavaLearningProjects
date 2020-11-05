package com.company.devices;

public class Monitor {

    private  int width = 3840 ;
    private  int height = 1920 ;

    public void setLowResolution(){
        width = 800;
        height = 600;
    }
    public void setHighResolution(){
        width = 2040;
        height = 1920;
    }

    public void getResolution (){
        System.out.println(height+ " x " + width);
    }
}
