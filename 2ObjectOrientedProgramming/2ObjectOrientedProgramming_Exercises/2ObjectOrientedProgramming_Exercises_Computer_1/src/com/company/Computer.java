package com.company;

import com.company.devices.Monitor;
import com.company.drive.Drive;
import com.company.usb.USBDevice;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private Monitor monitor;
    private Drive drive;
    List<USBDevice> usbList = new ArrayList<>();

    Computer(Monitor monitor, Drive drive) {
        this.monitor = monitor;
        this.drive = drive;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public List<USBDevice> getUsbList() {
        return usbList;
    }

    public void addUSBDevice(USBDevice device) {
        usbList.add(device);
    }

}
