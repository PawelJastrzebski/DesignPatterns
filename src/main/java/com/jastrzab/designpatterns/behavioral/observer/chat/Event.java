package com.jastrzab.designpatterns.behavioral.observer.chat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    public record AddUser(String userName) {}
    public record PostMessage(String userName, String message) { }

    public AddUser addUser;
    public PostMessage postMessage;

    public static Event AddUser(String name) {
        return Event.builder().addUser(new AddUser(name)).build();
    }

    public static Event PostMessage(String userName, String message) {
        return Event.builder().postMessage(new PostMessage(userName, message)).build();
    }

    @Override
    public String toString() {
        if (addUser != null) return addUser.toString();
        if (postMessage != null) return postMessage.toString();
        return "Empty";
    }
}
