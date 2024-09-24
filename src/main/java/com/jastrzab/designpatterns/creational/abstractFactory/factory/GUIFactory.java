package com.jastrzab.designpatterns.creational.abstractFactory.factory;

import com.jastrzab.designpatterns.creational.abstractFactory.elements.Button;
import com.jastrzab.designpatterns.creational.abstractFactory.elements.Input;

public interface GUIFactory {
    Button createButton();
    Input createInput();
}
