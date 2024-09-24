package com.jastrzab.designpatterns.creational.prototype.shapes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
public class Circle extends Shape {

    int radius;

    public Circle(Circle target) {
        super(target);
        if(target == null) return;
        this.radius = target.radius;
    }


    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle circle) || !super.equals(o)) return false;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }
}
