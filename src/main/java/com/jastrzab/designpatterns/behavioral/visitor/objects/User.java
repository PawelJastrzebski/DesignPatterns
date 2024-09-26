package com.jastrzab.designpatterns.behavioral.visitor.objects;

import com.jastrzab.designpatterns.behavioral.visitor.Visitor;
import com.jastrzab.designpatterns.behavioral.visitor.VisitorAware;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class User implements VisitorAware {
    public String name;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
