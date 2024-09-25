package com.jastrzab.designpatterns.creational.abstractFactory.elements;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class WindowsInput implements Input {
    @Override
    public void render() {
        log.info("Render Windows Input");
    }

    @Override
    public void enter(String text) {
        log.info("Windows Input text: {}", text);
    }
}
