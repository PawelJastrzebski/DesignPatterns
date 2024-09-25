package com.jastrzab.designpatterns.creational.factoryMethod.factory;

import com.jastrzab.designpatterns.creational.abstractFactory.elements.Button;
import com.jastrzab.designpatterns.creational.abstractFactory.elements.Input;
import lombok.extern.log4j.Log4j2;

@Log4j2
public abstract class DialogFactory {

    public void render() {
         log.info("New Dialog:");
        Button button = createButton();
        Input input = createInput();
        button.render();
        input.render();
    }

    public abstract Button createButton();
    public abstract Input createInput();

}
