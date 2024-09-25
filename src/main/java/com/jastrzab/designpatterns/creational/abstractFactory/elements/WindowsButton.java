package com.jastrzab.designpatterns.creational.abstractFactory.elements;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class WindowsButton implements Button{
    @Override
    public void render() {
         log.info("Render Windows Button");
    }

    @Override
    public void click() {
         log.info("Windows Button Click");
    }
}
