package com.jastrzab;


import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.behavioral.chainOfResponsibility.ChainOfResponsibilityApp;
import com.jastrzab.designpatterns.behavioral.command.CommandApp;
import com.jastrzab.designpatterns.behavioral.iterator.IteratorApp;
import com.jastrzab.designpatterns.creational.abstractFactory.AbstractFactoryApp;
import com.jastrzab.designpatterns.creational.builder.BuilderApp;
import com.jastrzab.designpatterns.creational.factoryMethod.FactoryMethodApp;
import com.jastrzab.designpatterns.creational.prototype.PrototypeApp;
import com.jastrzab.designpatterns.creational.singleton.SingletonApp;
import com.jastrzab.designpatterns.structural.adapter.AdapterApp;
import com.jastrzab.designpatterns.structural.bridge.BridgeApp;
import com.jastrzab.designpatterns.structural.composite.CompositeApp;
import com.jastrzab.designpatterns.structural.decorator.DecoratorApp;
import com.jastrzab.designpatterns.structural.facade.FacadeApp;
import com.jastrzab.designpatterns.structural.flyweight.FlyweightApp;
import com.jastrzab.designpatterns.structural.proxy.ProxyApp;
import lombok.extern.log4j.Log4j2;

import java.util.HashMap;

@Log4j2
public class Main {

    public static HashMap<String, Application> apps = new HashMap<>();

    static {
        apps.put("abstract-factory-app", new AbstractFactoryApp());
        apps.put("builder-app", new BuilderApp());
        apps.put("factory-method-app", new FactoryMethodApp());
        apps.put("prototype-app", new PrototypeApp());
        apps.put("singleton-app", new SingletonApp());
        apps.put("adapter-app", new AdapterApp());
        apps.put("bridge-app", new BridgeApp());
        apps.put("composite-app", new CompositeApp());
        apps.put("decorator-app", new DecoratorApp());
        apps.put("facade-app", new FacadeApp());
        apps.put("flyweight-app", new FlyweightApp());
        apps.put("proxy-app", new ProxyApp());
        apps.put("chain-of-responsibility-app", new ChainOfResponsibilityApp());
        apps.put("command-app", new CommandApp());
        apps.put("iterator-app", new IteratorApp());
    }

    public static void runApp(String appName) {
        Application app = apps.get(appName);
        if (app == null) {
            throw new IllegalStateException("App not found: " + appName);
        }

        log.info("--- {} ---", app.appName());
        app.startApplication();
        log.info("");
    }

    public static void main(String[] args) {
        System.setProperty("log4j.configurationFile", "resources:log4j2.xml");

        runApp("abstract-factory-app");
        runApp("builder-app");
        runApp("factory-method-app");
        runApp("prototype-app");
        runApp("singleton-app");
        runApp("adapter-app");
        runApp("bridge-app");
        runApp("composite-app");
        runApp("decorator-app");
        runApp("facade-app");
        runApp("flyweight-app");
        runApp("proxy-app");
        runApp("chain-of-responsibility-app");
        runApp("command-app");
        runApp("iterator-app");
    }
}
