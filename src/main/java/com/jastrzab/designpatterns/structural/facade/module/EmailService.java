package com.jastrzab.designpatterns.structural.facade.module;

public class EmailService {

    public void sentEmail(String to, String topic, String body) {
        System.out.println("Sending email");
        System.out.println("To: " + to);
        System.out.println("topic: " + topic);
        System.out.println("boyd: " + body);
    }
}
