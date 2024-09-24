package com.jastrzab;


import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.creational.abstractFactory.AbstractFactoryApp;
import com.jastrzab.designpatterns.creational.builder.BuilderApp;

import java.util.HashMap;

public class Main {

    public static HashMap<String, Application> apps = new HashMap<>();
    static  {
        apps.put("abstract-factory-app", new AbstractFactoryApp());
        apps.put("builder-app", new BuilderApp());
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
    }
}
