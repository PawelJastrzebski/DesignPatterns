package com.jastrzab.designpatterns.structural.decorator;

import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.structural.decorator.source.Base64Decorator;
import com.jastrzab.designpatterns.structural.decorator.source.DataSource;
import com.jastrzab.designpatterns.structural.decorator.source.StringDataSource;

import java.nio.charset.StandardCharsets;

public class DecoratorApp implements Application {
    @Override
    public String appName() {
        return "Decorator";
    }

    @Override
    public void startApplication() {
        StringDataSource source = new StringDataSource("Hello Decorator");
        DataSource base = new Base64Decorator(source);

        System.out.println("Raw: " + source.getRawData());
        base.write(source.read());

        System.out.println("Base64: " + source.getRawData());
        System.out.println("Decoded: " + new String(base.read()));
    }
}
