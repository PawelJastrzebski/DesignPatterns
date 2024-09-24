package com.jastrzab;


import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.creational.abstractFactory.AbstractFactoryApp;
import com.jastrzab.designpatterns.creational.builder.BuilderApp;
import com.jastrzab.designpatterns.creational.factoryMethod.FactoryMethodApp;
import com.jastrzab.designpatterns.creational.prototype.PrototypeApp;
import com.jastrzab.designpatterns.creational.singleton.SingletonApp;

import java.util.HashMap;

public class Main {

    public static HashMap<String, Application> apps = new HashMap<>();
    static  {
        apps.put("abstract-factory-app", new AbstractFactoryApp());
        apps.put("builder-app", new BuilderApp());
        apps.put("factory-method-app", new FactoryMethodApp());
        apps.put("prototype-app", new PrototypeApp());
        apps.put("singleton-app", new SingletonApp());
    }

    public static void runApp(String appName) {
        Application app = apps.get(appName);
        if (app == null) {
            throw new IllegalStateException("App not found: " + appName);
        }

        System.out.println("--- " + app.appName() + " ---");
        app.startApplication();
        System.out.println();
    }

    public static void main(String[] args) {
        runApp("abstract-factory-app");
        runApp("builder-app");
        runApp("factory-method-app");
        runApp("prototype-app");
        runApp("singleton-app");
    }
}
