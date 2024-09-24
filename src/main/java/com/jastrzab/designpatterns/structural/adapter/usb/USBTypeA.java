package com.jastrzab.designpatterns.structural.adapter.usb;

import java.util.Arrays;

public class USBTypeA {

    public void transferByUSBA(byte[] data) {
        System.out.println("Transfer by USBTypeA: " + Arrays.toString(data));
    }
}
