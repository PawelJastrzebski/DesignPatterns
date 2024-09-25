package com.jastrzab.designpatterns.structural.composite.containers;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

@Log4j2
public class PodContainer extends Container {

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
        log.info("Pod start:");
        containers.forEach(Container::start);
    }

    @Override
    public void restart() {
        log.info("Pod restart:");
        containers.forEach(Container::restart);
    }

    @Override
    public void stop() {
        log.info("Pod stop:");
        containers.forEach(Container::stop);
    }
}
