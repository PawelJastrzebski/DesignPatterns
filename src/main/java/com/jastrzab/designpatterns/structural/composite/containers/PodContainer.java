package com.jastrzab.designpatterns.structural.composite.containers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class PodContainer implements Container {

    private final LinkedList<Container> containers = new LinkedList<>();

    public PodContainer(Container... containers) {
        this.containers.addAll(Arrays.asList(containers));
    }

    @Override
    public String getName() {
        return containers.stream().map(Container::getName).collect(Collectors.joining(", "));
    }

    @Override
    public void start() {
        System.out.println("Pod start:");
        containers.forEach(Container::start);
    }

    @Override
    public void restart() {
        System.out.println("Pod restart:");
        containers.forEach(Container::restart);
    }

    @Override
    public void stop() {
        System.out.println("Pod stop:");
        containers.forEach(Container::stop);
    }
}
