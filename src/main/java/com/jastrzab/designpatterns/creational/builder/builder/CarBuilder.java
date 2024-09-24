package com.jastrzab.designpatterns.creational.builder.builder;

import com.jastrzab.designpatterns.creational.builder.products.Car;

public class CarBuilder implements CarProductsBuilder {
    String brand;
    String model;
    short productionYear;
    String vin;

    @Override
    public CarProductsBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarProductsBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarProductsBuilder setProductionYear(short year) {
        this.productionYear = year;
        return this;
    }

    @Override
    public CarProductsBuilder assignVinNumber(String vin) {
        this.vin = vin;
        return this;
    }

    public Car build() {
        return new Car(this.brand, this.model, this.productionYear, this.vin);
    }
}
