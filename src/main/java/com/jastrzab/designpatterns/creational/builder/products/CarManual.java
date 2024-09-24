package com.jastrzab.designpatterns.creational.builder.products;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class CarManual {
    String brand;
    String model;
    short productionYear;

    public String printManual() {
        return this.toString();
    }
}
