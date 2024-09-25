package com.jastrzab.designpatterns.structural.composite.containers;


import lombok.extern.log4j.Log4j2;

@Log4j2
public abstract class Container {
    abstract String getName();

    public void start() {
        log.info("Container start: {}", getName());
    }

    public void restart() {
        log.info("Container restart: {}", getName());
    }

    public void stop() {
        log.info("Container stop: {}", getName());
    }
}
