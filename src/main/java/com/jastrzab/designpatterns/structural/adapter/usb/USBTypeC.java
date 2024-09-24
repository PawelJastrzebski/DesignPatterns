package com.jastrzab.designpatterns.structural.adapter.usb;

import java.util.Arrays;

public class USBTypeC implements USBTransfer {

    public void transfer(String header, byte[] data) {
        System.out.println("Transfer by USBTypeC: " + Arrays.toString(data) + " Header: " + header);
    }
}
