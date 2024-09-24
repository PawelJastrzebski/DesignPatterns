package com.jastrzab.designpatterns.creational.builder.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Car {
    String brand;
    String model;
    short productionYear;
    String vinNumber;

    public boolean checkVinNumber() {
        return vinNumber != null && vinNumber.length() > 3;
    }

}
