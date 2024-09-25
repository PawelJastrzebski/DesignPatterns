package com.jastrzab.designpatterns.behavioral.iterator;

import com.jastrzab.designpatterns.Application;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class IteratorApp implements Application {
    @Override
    public String appName() {
        return "Iterator";
    }

    @Override
    public void startApplication() {
        Iterator<Integer> i = new SimpleIterator<>(List.of(1, 20, 3, 4));
        while (i.hasNext()) {
            log.info("{}", i.next());
        }
    }
}
