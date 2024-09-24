package com.jastrzab.designpatterns.creational.builder;

import com.jastrzab.designpatterns.Application;
import com.jastrzab.designpatterns.creational.builder.builder.CarBuilder;
import com.jastrzab.designpatterns.creational.builder.builder.CarManualBuilder;
import com.jastrzab.designpatterns.creational.builder.products.Car;
import com.jastrzab.designpatterns.creational.builder.products.CarManual;

public class BuilderApp implements Application, Director {
    @Override
    public String appName() {
        return "Builder";
    }

    @Override
    public void startApplication() {
        CarManualBuilder manualBuilder = new CarManualBuilder();
        CarBuilder carBuilder = new CarBuilder();

        this.buildAudi(manualBuilder);
        this.buildAudi(carBuilder);
        Car car = carBuilder.build();
        CarManual manual = manualBuilder.build();

        if (car.checkVinNumber()) {
            System.out.println("VIN is valid: " + car.getVinNumber());
        }

        System.out.println("Car manual:");
        System.out.println(manual.printManual());
    }
}
