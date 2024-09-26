package com.jastrzab.designpatterns.behavioral.templateMethod.http;

public class TodoOneRequest  extends RequestTemplate {
    private final String id;

    public TodoOneRequest(String id) {
        this.id = id;
    }

    @Override
    String getUrl() {
        return "https://jsonplaceholder.typicode.com/todos/" + id;
    }
}
