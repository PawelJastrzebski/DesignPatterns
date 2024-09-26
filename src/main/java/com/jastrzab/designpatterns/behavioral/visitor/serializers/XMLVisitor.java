package com.jastrzab.designpatterns.behavioral.visitor.serializers;

import com.jastrzab.designpatterns.behavioral.visitor.Visitor;
import com.jastrzab.designpatterns.behavioral.visitor.VisitorAware;
import com.jastrzab.designpatterns.behavioral.visitor.objects.Product;
import com.jastrzab.designpatterns.behavioral.visitor.objects.User;

import java.util.LinkedList;
import java.util.List;

public class XMLVisitor implements Visitor {
    private final List<String> objects = new LinkedList<>();

    public XMLVisitor(List<VisitorAware> visitors) {
        for (VisitorAware visitor : visitors) {
            visitor.accept(this);
        }
    }

    public String toXml() {
        return "<list>" + String.join("", objects) + "</list>";
    }

    @Override
    public void visit(User user) {
        objects.add("""
                <product><name>{{name}}</name></product>"""
                .replace("{{name}}", user.name)
        );
    }

    @Override
    public void visit(Product user) {
        objects.add("""
                <product><name>{{name}}</name><price>{{price}}</price></product>"""
                .replace("{{name}}", user.name)
                .replace("{{price}}", user.price + "")
        );
    }
}
