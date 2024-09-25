package com.jastrzab.designpatterns.structural.composite.containers;

public class JavaContainer implements Container {

    private final String appName;

    public JavaContainer(String appName) {
        this.appName = appName;
    }

    @Override
    public String getName() {
        return "Java: " + this.appName;
    }
}
