package com.jastrzab.designpatterns.creational.singleton;

import com.jastrzab.designpatterns.Application;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class SingletonApp implements Application {
    @Override
    public String appName() {
        return "Singleton";
    }

    @Override
    @SneakyThrows
    public void startApplication() {
        ServiceSingleton s1 = ServiceSingleton.getInstance();
        Thread.sleep(100);
        ServiceSingleton s2 = ServiceSingleton.getInstance();

        if (s1.value.equals(s2.value)) {
            log.info("Singleton created: {}", s1.value);
        }
    }
}
