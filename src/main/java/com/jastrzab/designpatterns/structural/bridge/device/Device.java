package com.jastrzab.designpatterns.structural.bridge.device;

public interface Device {
    int getVolume();

    void setVolume(int value);

    void enable();

    void disable();

    boolean isEnabled();
}
