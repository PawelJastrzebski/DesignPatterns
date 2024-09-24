package com.jastrzab.designpatterns.creational.abstractFactory.factory;

import com.jastrzab.designpatterns.creational.abstractFactory.elements.Button;
import com.jastrzab.designpatterns.creational.abstractFactory.elements.Input;
import com.jastrzab.designpatterns.creational.abstractFactory.elements.WindowsButton;
import com.jastrzab.designpatterns.creational.abstractFactory.elements.WindowsInput;

public class WindowsGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Input createInput() {
        return new WindowsInput();
    }
}
