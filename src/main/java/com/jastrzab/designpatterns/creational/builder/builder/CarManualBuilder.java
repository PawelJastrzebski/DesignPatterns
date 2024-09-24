package com.jastrzab.designpatterns.creational.builder.builder;

import com.jastrzab.designpatterns.creational.builder.products.CarManual;

public class CarManualBuilder implements CarProductsBuilder {
    String brand;
    String model;
    short productionYear;

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
        // skip
        return this;
    }

    public CarManual build() {
        return new CarManual(this.brand, this.model, this.productionYear);
    }
}
