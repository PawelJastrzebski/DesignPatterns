package com.jastrzab.designpatterns.creational.prototype.shapes;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Rectangle extends Shape {

    int width;
    int height;

    public Rectangle(Rectangle target) {
        super(target);
        if(target == null) return;
        this.width = target.width;
        this.height = target.height;
    }


    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
