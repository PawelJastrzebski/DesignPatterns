package com.jastrzab.designpatterns.structural.adapter.usb;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;

@Log4j2
public class USBTypeC implements USBTransfer {

    public void transfer(String header, byte[] data) {
        log.info("Transfer by USBTypeC: {} Header: {}", Arrays.toString(data), header);
    }
}
