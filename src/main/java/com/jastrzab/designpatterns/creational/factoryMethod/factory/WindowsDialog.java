package com.jastrzab.designpatterns.creational.factoryMethod.factory;

import com.jastrzab.designpatterns.creational.abstractFactory.elements.Button;
import com.jastrzab.designpatterns.creational.abstractFactory.elements.Input;
import com.jastrzab.designpatterns.creational.abstractFactory.elements.WindowsButton;
import com.jastrzab.designpatterns.creational.abstractFactory.elements.WindowsInput;

public class WindowsDialog extends DialogFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Input createInput() {
        return new WindowsInput();
    }
}
