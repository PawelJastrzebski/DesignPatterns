package com.jastrzab.designpatterns.structural.adapter;

import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.structural.adapter.usb.USBTransfer;
import com.jastrzab.designpatterns.structural.adapter.usb.USBTypeA;
import com.jastrzab.designpatterns.structural.adapter.usb.USBTypeAAdapter;
import com.jastrzab.designpatterns.structural.adapter.usb.USBTypeC;

public class AdapterApp implements Application {
    @Override
    public String appName() {
        return "Adapter";
    }

    public void transferData(USBTransfer transfer, byte[] data) {
        transfer.transfer("Header data", data);
    }

    @Override
    public void startApplication() {
        USBTypeA USBa = new USBTypeA();
        USBTypeC USBc = new USBTypeC();

        transferData(USBc, new byte[]{1, 2, 3});
        transferData(new USBTypeAAdapter(USBa), new byte[]{1, 2, 4});
    }
}
