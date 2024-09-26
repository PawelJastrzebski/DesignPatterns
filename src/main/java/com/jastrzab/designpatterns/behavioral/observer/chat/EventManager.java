package com.jastrzab.designpatterns.behavioral.observer.chat;

import java.util.function.Consumer;

public interface EventManager<T> {
    void subscribe(String channel, Consumer<T> callback);
    void unsubscribe(String channel, Consumer<T> callback);
    void notify(String channel, T data);
}
