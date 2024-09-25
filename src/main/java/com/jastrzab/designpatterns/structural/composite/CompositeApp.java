package com.jastrzab.designpatterns.structural.composite;

import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.structural.composite.containers.Container;
import com.jastrzab.designpatterns.structural.composite.containers.JavaContainer;
import com.jastrzab.designpatterns.structural.composite.containers.NginxContainer;
import com.jastrzab.designpatterns.structural.composite.containers.PodContainer;

public class CompositeApp implements Application {
    @Override
    public String appName() {
        return "Composite";
    }

    public void restart(Container container) {
        container.restart();
    }

    public void start(Container container) {
        container.start();
    }

    @Override
    public void startApplication() {
        JavaContainer java = new JavaContainer("Hello World");
        PodContainer pod = new PodContainer(new NginxContainer(), new JavaContainer("Enterprise Java App"));

        this.start(java);
        this.start(pod);

        this.restart(pod);
    }
}
