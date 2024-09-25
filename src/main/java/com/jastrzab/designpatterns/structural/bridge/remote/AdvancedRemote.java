package com.jastrzab.designpatterns.structural.bridge.remote;

import com.jastrzab.designpatterns.structural.bridge.device.Device;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        this.device.setVolume(0);
    }
}
