package com.jastrzab.designpatterns.creational.builder.builder;

public interface CarProductsBuilder {
    CarProductsBuilder setBrand(String brand);
    CarProductsBuilder setModel(String model);
    CarProductsBuilder setProductionYear(short year);
    CarProductsBuilder assignVinNumber(String vin);
}
