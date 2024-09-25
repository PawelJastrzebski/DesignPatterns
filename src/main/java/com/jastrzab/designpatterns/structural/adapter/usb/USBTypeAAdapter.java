package com.jastrzab.designpatterns.structural.adapter.usb;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
public class USBTypeAAdapter implements USBTransfer {

    private USBTypeA usbTypeA;

    @Override
    public void transfer(String header, byte[] data) {
        log.info("Skip data header USB A Adapter");
        this.usbTypeA.transferByUSBA(data);
    }
}
