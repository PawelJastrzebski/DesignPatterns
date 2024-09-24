package com.jastrzab.designpatterns.creational.prototype;

import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.creational.prototype.shapes.Circle;

public class PrototypeApp implements Application {
    @Override
    public String appName() {
        return "Prototype";
    }

    @Override
    public void startApplication() {
        Circle c1 = new Circle();
        c1.setX(1);
        c1.setX(1);
        c1.setRadius(10);

        Circle c2 = (Circle) c1.clone();
        c2.setRadius(20);
        if (!c2.equals(c1)) {
            System.out.println("Circle is different");
        }
        if (c2.getX() == c1.getX() && c2.getY() == c1.getY()) {
            System.out.println("Circles are in the same position");
        }
    }
}
