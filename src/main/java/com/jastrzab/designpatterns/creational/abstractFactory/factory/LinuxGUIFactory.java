package com.jastrzab.designpatterns.creational.abstractFactory.factory;

import com.jastrzab.designpatterns.creational.abstractFactory.elements.Button;
import com.jastrzab.designpatterns.creational.abstractFactory.elements.Input;
import com.jastrzab.designpatterns.creational.abstractFactory.elements.LinuxButton;
import com.jastrzab.designpatterns.creational.abstractFactory.elements.LinuxInput;

public class LinuxGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Input createInput() {
        return new LinuxInput();
    }
}
