package com.jastrzab.designpatterns.creational.prototype.shapes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@NoArgsConstructor
public abstract class Shape {
    @Setter
    int x;
    @Setter
    int y;
    String color;

    public Shape(Shape target) {
        if (target == null) return;
        this.x = target.x;
        this.y = target.y;
        this.color = target.color;
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape shape) || !super.equals(o)) return false;
        return x == shape.x && y == shape.y && Objects.equals(color, shape.color);
    }
}
