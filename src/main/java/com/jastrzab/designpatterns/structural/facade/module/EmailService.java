package com.jastrzab.designpatterns.structural.facade.module;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class EmailService {

    public void sentEmail(String to, String topic, String body) {
         log.info("Sending email");
        log.info("To: {}", to);
        log.info("topic: {}", topic);
        log.info("boyd: {}", body);
    }
}
