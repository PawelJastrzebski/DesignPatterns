package com.jastrzab.designpatterns.creational.abstractFactory.elements;

public class WindowsInput implements Input {
    @Override
    public void render() {
        System.out.println("Render Windows Input");
    }

    @Override
    public void enter(String text) {
        System.out.println("Windows Input text: " + text);
    }
}
