package com.jastrzab.designpatterns.structural.bridge.remote;

import com.jastrzab.designpatterns.structural.bridge.device.Device;

public class BasicRemote implements Remote {

    protected final Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void volumeUp() {
        int volume = this.device.getVolume();
        if (volume >= 100) return;
        this.device.setVolume(volume + 1);
    }

    @Override
    public void volumeDown() {
        int volume = this.device.getVolume();
        if (volume <= 0) return;
        this.device.setVolume(volume - 1);
    }

    @Override
    public void power() {
        if (this.device.isEnabled()) {
            this.device.disable();
        } else {
            this.device.enable();
        }
    }
}
