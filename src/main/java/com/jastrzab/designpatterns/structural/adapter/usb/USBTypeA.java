package com.jastrzab.designpatterns.structural.adapter.usb;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;

@Log4j2
public class USBTypeA {

    public void transferByUSBA(byte[] data) {
        log.info("Transfer by USBTypeA: {}", Arrays.toString(data));
    }
}
