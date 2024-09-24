package com.jastrzab.designpatterns.creational.builder;

import com.jastrzab.designpatterns.creational.builder.builder.CarProductsBuilder;

public interface Director {

    default void buildAudi(CarProductsBuilder builder) {
        builder.setBrand("Audi")
                .setModel("A4")
                .assignVinNumber("VIN123")
                .setProductionYear((short) 2000);
    }

    default void buildTesla(CarProductsBuilder builder) {
        builder.setBrand("Tesla")
                .setModel("3")
                .setProductionYear((short) 2022)
                .assignVinNumber("VIN334");
    }
}
