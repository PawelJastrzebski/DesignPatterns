package com.jastrzab.designpatterns.structural.adapter.usb;

public interface USBTransfer {
    void transfer(String header, byte[] data);
}
