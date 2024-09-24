package com.jastrzab.designpatterns.creational.factoryMethod.factory;

import com.jastrzab.designpatterns.creational.abstractFactory.elements.Button;
import com.jastrzab.designpatterns.creational.abstractFactory.elements.Input;

public abstract class DialogFactory {

    public void render() {
        System.out.println("New Dialog:");
        Button button = createButton();
        Input input = createInput();
        button.render();
        input.render();
    }

    public abstract Button createButton();
    public abstract Input createInput();

}
