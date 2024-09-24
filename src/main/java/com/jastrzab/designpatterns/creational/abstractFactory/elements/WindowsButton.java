package com.jastrzab.designpatterns.creational.abstractFactory.elements;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("Render Windows Button");
    }

    @Override
    public void click() {
        System.out.println("Windows Button Click");
    }
}
