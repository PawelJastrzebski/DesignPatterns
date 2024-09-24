package com.jastrzab.designpatterns.creational.abstractFactory;

import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.creational.abstractFactory.elements.Button;
import com.jastrzab.designpatterns.creational.abstractFactory.elements.Input;
import com.jastrzab.designpatterns.creational.abstractFactory.factory.GUIFactory;
import com.jastrzab.designpatterns.creational.abstractFactory.factory.LinuxGUIFactory;
import com.jastrzab.designpatterns.creational.abstractFactory.factory.WindowsGUIFactory;

public class AbstractFactoryApp implements Application {


    static class App {
        GUIFactory factory;

        public App(GUIFactory factory) {
            this.factory = factory;
        }

        public void run() {
            Button confirm = factory.createButton();
            Input login = factory.createInput();
            Input password = factory.createInput();

            login.render();
            password.render();
            confirm.render();

            login.enter("Login@gmail.com");
            password.enter("*******");
            confirm.click();
        }

    }


    @Override
    public String appName() {
        return "Abstract Factory";
    }

    @Override
    public void startApplication() {
        boolean isLinux = true;
        App app = isLinux ? new App(new LinuxGUIFactory()) : new App(new WindowsGUIFactory());
        app.run();
    }
}
