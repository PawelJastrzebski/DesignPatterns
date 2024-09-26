package com.jastrzab.designpatterns.behavioral.visitor.objects;

import com.jastrzab.designpatterns.behavioral.visitor.Visitor;
import com.jastrzab.designpatterns.behavioral.visitor.VisitorAware;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Product implements VisitorAware {
    public String name;
    public int price;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
