package com.jastrzab.designpatterns.structural.adapter.usb;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class USBTypeAAdapter implements USBTransfer {

    private USBTypeA usbTypeA;

    @Override
    public void transfer(String header, byte[] data) {
        System.out.println("Skip data header USB A Adapter");
        this.usbTypeA.transferByUSBA(data);
    }
}
