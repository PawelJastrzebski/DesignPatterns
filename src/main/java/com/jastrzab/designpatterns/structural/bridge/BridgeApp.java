package com.jastrzab.designpatterns.structural.bridge;

import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.structural.bridge.device.RadioDevice;
import com.jastrzab.designpatterns.structural.bridge.device.TVDevice;
import com.jastrzab.designpatterns.structural.bridge.remote.AdvancedRemote;
import com.jastrzab.designpatterns.structural.bridge.remote.BasicRemote;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class BridgeApp implements Application {
    @Override
    public String appName() {
        return "Bridge";
    }

    @Override
    public void startApplication() {
        TVDevice tv = new TVDevice();
        RadioDevice radio = new RadioDevice();

        BasicRemote tvRemote = new BasicRemote(tv);
        AdvancedRemote radioRemote = new AdvancedRemote(radio);

        tvRemote.power();
        if (tv.isEnabled()) {
             log.info("TV is on");
        }

        radioRemote.mute();
        if (radio.getVolume() == 0) {
             log.info("Radio is muted");
        }
    }
}
