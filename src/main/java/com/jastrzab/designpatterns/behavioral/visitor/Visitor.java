package com.jastrzab.designpatterns.behavioral.visitor;

import com.jastrzab.designpatterns.behavioral.visitor.objects.Product;
import com.jastrzab.designpatterns.behavioral.visitor.objects.User;

public interface Visitor {
    void visit(User user);
    void visit(Product user);
}
