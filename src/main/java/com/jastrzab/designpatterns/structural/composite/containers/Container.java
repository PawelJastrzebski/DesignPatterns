package com.jastrzab.designpatterns.structural.composite.containers;

public interface Container {
    String getName();
    default void start() {
        System.out.println("Container start: " + getName());
    }
    default void restart() {
        System.out.println("Container restart: " + getName());
    }
    default void stop() {
        System.out.println("Container stop: " + getName());
    }
}
