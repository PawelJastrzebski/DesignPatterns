package com.jastrzab.designpatterns.behavioral.visitor;

import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.behavioral.visitor.objects.Product;
import com.jastrzab.designpatterns.behavioral.visitor.objects.User;
import com.jastrzab.designpatterns.behavioral.visitor.serializers.JsonVisitor;
import com.jastrzab.designpatterns.behavioral.visitor.serializers.XMLVisitor;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class VisitorApp implements Application {
    @Override
    public String appName() {
        return "Visitor";
    }

    @Override
    public void startApplication() {
        User user = new User("Admin");
        Product product = new Product("Ted", 1099);
        JsonVisitor visitorJson = new JsonVisitor(List.of(user, product));
        XMLVisitor visitorXML = new XMLVisitor(List.of(user, product));
        log.info("Json: {}", visitorJson.toJson());
        log.info("XML: {}", visitorXML.toXml());
    }
}
