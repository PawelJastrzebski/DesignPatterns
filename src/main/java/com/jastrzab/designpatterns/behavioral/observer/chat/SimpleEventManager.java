package com.jastrzab.designpatterns.behavioral.observer.chat;

import java.util.*;
import java.util.function.Consumer;

import static java.util.Optional.ofNullable;

public class SimpleEventManager implements EventManager<Event> {

    private final Map<String, LinkedList<Consumer<Event>>> listeners = new HashMap();

    @Override
    public void subscribe(String channel, Consumer<Event> callback) {
        listeners.putIfAbsent(channel, new LinkedList<>());
        listeners.get(channel).add(callback);
    }

    @Override
    public void unsubscribe(String channel, Consumer<Event> callback) {
        ofNullable(listeners.get(channel)).ifPresent((list) -> {
            list.remove(callback);
        });
    }

    @Override
    public void notify(String channel, Event data) {
        ofNullable(listeners.get(channel)).ifPresent((list) -> {
            for (Consumer<Event> eventConsumer : list) {
                eventConsumer.accept(data);
            }
        });
    }
}
