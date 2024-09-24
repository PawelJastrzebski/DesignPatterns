package com.jastrzab.designpatterns.creational.abstractFactory.elements;

public class LinuxButton implements Button{
    @Override
    public void render() {
        System.out.println("Render Linux Button");
    }

    @Override
    public void click() {
        System.out.println("Linux Button Click");
    }
}
