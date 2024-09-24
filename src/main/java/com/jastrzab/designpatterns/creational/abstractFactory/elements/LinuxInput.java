package com.jastrzab.designpatterns.creational.abstractFactory.elements;

public class LinuxInput implements Input{
    @Override
    public void render() {
        System.out.println("Render Linux Input");
    }

    @Override
    public void enter(String text) {
        System.out.println("Linux Input text: " + text);
    }
}
