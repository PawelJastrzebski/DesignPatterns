package com.jastrzab.designpatterns.creational.factoryMethod.factory;

import com.jastrzab.designpatterns.creational.abstractFactory.elements.*;

public class LinuxDialog extends DialogFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Input createInput() {
        return new LinuxInput();
    }
}
