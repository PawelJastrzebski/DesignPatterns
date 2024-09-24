package com.jastrzab.designpatterns.creational.factoryMethod;

import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.creational.factoryMethod.factory.DialogFactory;
import com.jastrzab.designpatterns.creational.factoryMethod.factory.LinuxDialog;
import com.jastrzab.designpatterns.creational.factoryMethod.factory.WindowsDialog;

public class FactoryMethodApp implements Application {

    @Override
    public String appName() {
        return "Factory Method";
    }

    @Override
    public void startApplication() {
        boolean isLinux = false;
        DialogFactory dialogFactory = isLinux ? new LinuxDialog() : new WindowsDialog();

        // Business Logic
        dialogFactory.render();
    }
}
