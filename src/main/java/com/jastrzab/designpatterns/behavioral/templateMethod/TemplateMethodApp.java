package com.jastrzab.designpatterns.behavioral.templateMethod;

import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.behavioral.templateMethod.http.TodoOneRequest;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

import java.net.http.HttpResponse;

@Log4j2
public class TemplateMethodApp implements Application {
    @Override
    public String appName() {
        return "Template Method";
    }

    @SneakyThrows
    @Override
    public void startApplication() {
        HttpResponse<String> res = new TodoOneRequest("1").get();
        log.info("Response: {}", res.body());
    }
}
