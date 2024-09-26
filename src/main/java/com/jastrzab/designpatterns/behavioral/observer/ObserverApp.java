package com.jastrzab.designpatterns.behavioral.observer;

import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.behavioral.observer.chat.Event;
import com.jastrzab.designpatterns.behavioral.observer.chat.EventManager;
import com.jastrzab.designpatterns.behavioral.observer.chat.SimpleEventManager;
import lombok.extern.log4j.Log4j2;

import java.util.function.Consumer;

@Log4j2
public class ObserverApp implements Application {

    @Override
    public String appName() {
        return "Observer";
    }

    @Override
    public void startApplication() {
        EventManager<Event> manager = new SimpleEventManager();
        Consumer<Event> onAddUser = (event) -> {
            log.info("New user: {}", event);
        };
        Consumer<Event> onMessage = (event) -> {
            log.info("New message: {}", event);
        };

        manager.subscribe("new-user", onAddUser);
        manager.subscribe("post-message", onMessage);
        manager.notify("new-user", Event.AddUser("Tom"));
        manager.notify("post-message", Event.PostMessage("Admin", "Welcome to the jungle!"));
        manager.notify("post-message", Event.PostMessage("Tom", "Hello :)"));
        manager.unsubscribe("post-message", onMessage);
    }
}
