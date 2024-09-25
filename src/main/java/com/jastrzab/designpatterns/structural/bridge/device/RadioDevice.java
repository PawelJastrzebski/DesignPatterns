package com.jastrzab.designpatterns.structural.bridge.device;

public class RadioDevice implements Device {
    private boolean on = false;
    private int volume = 20;

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int value) {
        this.volume = value;
    }

    @Override
    public void enable() {
        this.on = true;
    }

    @Override
    public void disable() {
        this.on = false;
    }

    @Override
    public boolean isEnabled() {
        return this.on;
    }
}
