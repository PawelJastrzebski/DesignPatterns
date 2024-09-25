package com.jastrzab.designpatterns.structural.decorator;

import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.structural.decorator.source.Base64Decorator;
import com.jastrzab.designpatterns.structural.decorator.source.DataSource;
import com.jastrzab.designpatterns.structural.decorator.source.StringDataSource;
import lombok.extern.log4j.Log4j2;

import java.nio.charset.StandardCharsets;

@Log4j2
public class DecoratorApp implements Application {
    @Override
    public String appName() {
        return "Decorator";
    }

    @Override
    public void startApplication() {
        StringDataSource source = new StringDataSource("Hello Decorator");
        DataSource base = new Base64Decorator(source);

        log.info("Raw: {}", source.getRawData());
        base.write(source.read());

        log.info("Base64: {}", source.getRawData());
        log.info("Decoded: {}", new String(base.read()));
    }
}
