package com.jastrzab.designpatterns.creational.singleton;

import java.time.Instant;

public class ServiceSingleton {

    final String value;

    private static volatile ServiceSingleton instance;

    private ServiceSingleton(String value) {
        this.value = value;
    }

    public static ServiceSingleton getInstance() {
        ServiceSingleton ref = ServiceSingleton.instance;
        if (ref != null) return ref;

        synchronized (ServiceSingleton.class) {
            if (instance == null) {
                instance = new ServiceSingleton("at: " + Instant.now().toEpochMilli());
            }
            return instance;
        }
    }

}
