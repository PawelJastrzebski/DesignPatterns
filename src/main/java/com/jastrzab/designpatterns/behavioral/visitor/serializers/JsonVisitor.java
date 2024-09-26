package com.jastrzab.designpatterns.behavioral.visitor.serializers;

import com.jastrzab.designpatterns.behavioral.visitor.Visitor;
import com.jastrzab.designpatterns.behavioral.visitor.VisitorAware;
import com.jastrzab.designpatterns.behavioral.visitor.objects.Product;
import com.jastrzab.designpatterns.behavioral.visitor.objects.User;

import java.util.LinkedList;
import java.util.List;

public class JsonVisitor implements Visitor {
    private final List<String> objects = new LinkedList<>();

    public JsonVisitor(List<VisitorAware> visitors) {
        for (VisitorAware visitor : visitors) {
            visitor.accept(this);
        }
    }

    public String toJson() {
        return "[" + String.join(",", objects) + "]";
    }

    @Override
    public void visit(User user) {
        objects.add("""
                {"name": "<name>"}"""
                .replace("<name>", user.name)
        );
    }

    @Override
    public void visit(Product user) {
        objects.add("""
                {"name": "<name>, "price": <price>}"""
                .replace("<name>", user.name)
                .replace("<price>", user.price + "")
        );
    }
}
